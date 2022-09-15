package main.Command.command4.br.udesc.ppr55.command4.Command;

import main.Command.command3.br.udesc.pp55.command3.command.*;
import main.Command.command3.br.udesc.pp55.command3.observer.Observer;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public class CommandFactory {

	private Map<String, Class<? extends Command>> comandos = new HashMap<>();
	private Observer observer;

	public CommandFactory(/* Observer observer */) {

		comandos.put("circ", AdicionarCirculo.class);
		comandos.put("quad", AdicionarQuadrado.class);
	}

	public Command getCommand(String comando, String[] dados) throws Exception {
	
		Class<? extends Command> commClass = comandos.get(comando);
		
		Class<?>[] params;
		if (dados != null) {
			params = new Class<?>[] {Observer.class, String[].class};
		} else {
			params = new Class<?>[] {Observer.class};
		}

		Constructor<? extends Command> constr = commClass.getConstructor(params);
		
		Command comm;
		if (dados != null) {
			comm = constr.newInstance(observer, dados);
		} else {
			comm = constr.newInstance(observer);
		}

		return comm;
	}
}
