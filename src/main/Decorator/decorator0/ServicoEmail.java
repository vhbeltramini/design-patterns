package main.Decorator.decorator0;

public class ServicoEmail  {

	public void enviar(Email email) {
		System.out.println("Enviado para "+email.getDestino()+
				" de "+email.getRemetente()+
				" \nAssunto : " + email.getAssunto() + 
				" \nCorpo : " + email.getConteudo());
	}
}
