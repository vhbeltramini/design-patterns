package main.Observer.observer2.observer2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Suporte {

    private Map<String, Cliente> tickets = new HashMap<>();

    private List<Observador> tecnicos = new ArrayList<>();

    public void enviarMensagem(Cliente cliente, String mensagem) {
        this.tickets.put(mensagem, cliente);

        notificarTecnicos(cliente, mensagem);
    }

    private void notificarTecnicos(Cliente cliente, String mensagem) {
        for (Observador obs:tecnicos) {
                String resposta = obs.receberMensagem(mensagem);
                if (resposta != null)
                        resolverTicket(cliente, mensagem, resposta);
        }
    }

    public void resolverTicket(Cliente cliente, String mensagem, String resposta) {
        this.tickets.remove(mensagem);
        cliente.enviarResposta(mensagem, resposta);
    }
	
    public void anexar(Observador ob) {
        this.tecnicos.add(ob);
    }
        
    public void desanexar(Observador ob) {
    	this.tecnicos.remove(ob);
    }
    
}
