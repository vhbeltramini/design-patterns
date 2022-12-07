package main.Decorator.decorator0;

public class Sistema {

	public static void main(String[] args) {
		Email.EmailBuilder emailB = new Email.EmailBuilder();
		emailB.remetente("eu@gmail.com")
				.destino("tu@gmail.com")
				.assunto("Alta nas Vendas")
				.conteudo("Venho comunicar que esse m�s tivemos um faturamento 20% maior");
		
		Email email1 = new Email(emailB);
		
		emailB.destino("srsilva@gmail.com")
				.conteudo("Prezado Sr. Silva, "+
		           "Informo que esse m�s alcan�amos a marca recorde de 20% adicional nas vendas.");
		
		Email email2 = new Email(emailB);
		
		ServicoEmail servico1 = new ServicoEmail();
		servico1.enviar(email1);
		
		ServicoEmail servico2 = new ServicoEmail();
		servico2.enviar(email2);
	}

}
