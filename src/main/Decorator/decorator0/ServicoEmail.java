package main.Decorator.decorator0;

// Identifique/implemente a classe que se deseja decorar (Componente Concreto);
// Passo 3 - Aplique a relação de herança entre os elementos dos itens 1 e 2;
public class ServicoEmail implements IServicoEmail {

	@Override
	public void enviar(Email email) {
		System.out.println("Enviado para "+email.getDestino()+
				" de "+email.getRemetente()+
				" \nAssunto : " + email.getAssunto() + 
				" \nCorpo : " + email.getConteudo());
	}

}
