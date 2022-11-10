package prova;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sistema {

	static Map<String, Class<? extends Command>> comandos;

	public static void main(String[] args) throws Exception {

		comandos = new HashMap<>();
		comandos.put("reservar", ReservarCommand.class);
		comandos.put("cancelarReserva", CancelarReservaCommand.class);
		comandos.put("checkIn", CheckInCommand.class);
		comandos.put("checkOut", CheckOutCommand.class);
		comandos.put("addConsumo", AddConsumoCommand.class);
		comandos.put("pagar", PagarCommand.class);

		Cliente cliente = buscarCliente(1);
		Date date = converterData("17/05/2022");


		CommandInvoker ci = new CommandInvoker();

		Hotel hotel = new Hotel();


//		hotel.reservar(date, 10, cliente);

		Command comm = getCommandByFuncName("reservar", cliente, date, hotel, 10, Optional.empty(), Optional.empty());

		ci.add(comm);
		ci.execute();

		ci.undo();

		Command commReservar2 = getCommandByFuncName("reservar", cliente, date, hotel, 10, Optional.empty(), Optional.empty());
		ci.execute(commReservar2);
//		hotel.cancelarReserva(date, 10, cliente);
		ci.undo();


		ci.execute(getCommandByFuncName("reservar", cliente, date, hotel, 15, Optional.empty(), Optional.empty()));
		ci.undo();
//		hotel.reservar(date, 15, cliente);
		ci.execute(getCommandByFuncName("reservar", cliente, date, hotel, 15, Optional.empty(), Optional.empty()));

		ci.add(getCommandByFuncName("checkIn", cliente, date, hotel, 15, Optional.empty(), Optional.empty()));
//		hotel.addConsumo(date, 15, buscarProduto(30), 3);
		ci.add(getCommandByFuncName("addConsumo", cliente, date, hotel, 15, Optional.of(buscarProduto(30)), Optional.of(3)));
//		hotel.addConsumo(date, 15, buscarProduto(30), 3);
		ci.add(getCommandByFuncName("addConsumo", cliente, date, hotel, 15, Optional.of(buscarProduto(50)), Optional.of(10)));
//		double total = hotel.checkOut(date, 10, cliente);
		ci.add(getCommandByFuncName("checkOut", cliente, date, hotel, 10, Optional.empty(), Optional.empty()));
//		hotel.pagar(10, cliente, total);
		ci.add(getCommandByFuncName("pagar", cliente, date, hotel, 10, Optional.empty(), Optional.empty()));

		ci.add(getCommandByFuncName("checkOut", cliente, date, hotel, 15, Optional.empty(), Optional.empty()));

		ci.add(getCommandByFuncName("pagar", cliente, date, hotel, 15, Optional.empty(), Optional.empty()));

		ci.execute();
	}

	public static Command getCommandByFuncName(String funcName, Cliente cliente, Date date, Hotel hotel, int numeroQuarto, Optional<Produto> produto, Optional<Integer> qtd) throws Exception {

		Class<? extends Command> commClass = comandos.get(funcName);
		Command comm;
		if (produto.isPresent() && qtd.isPresent()) {
			Constructor<? extends Command> constr = commClass.getConstructor(Hotel.class, int.class, Cliente.class, Date.class, Produto.class, Integer.class);
			comm = constr.newInstance(hotel, numeroQuarto, cliente, date, produto.get(), qtd.get());
		} else if (Objects.equals(funcName, "checkOut")) {
			Constructor<? extends Command> constr = commClass.getConstructor(Observer.class, Hotel.class, int.class, Cliente.class, Date.class);
			comm = constr.newInstance(DadosQuartos.getInstance(), hotel, numeroQuarto, cliente, date);
		} else {
			Constructor<? extends Command> constr = commClass.getConstructor(Hotel.class, int.class, Cliente.class, Date.class);
			comm = constr.newInstance(hotel, numeroQuarto, cliente, date);
		}

		return comm;
	}

	private static Produto buscarProduto(int i) {
		// metodo fake
		return new Produto();
	}

	private static Date converterData(String dataS) throws ParseException {
		return sdf.parse(dataS);
	}

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private static Cliente buscarCliente(int i) {
		// metodo fake
		return new Cliente();
	}

}
