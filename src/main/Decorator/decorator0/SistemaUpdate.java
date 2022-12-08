package main.Decorator.decorator0;

public class SistemaUpdate {

	public static void main(String[] args) {
		Email.EmailBuilder emailB = new Email.EmailBuilder();
		emailB.remetente("eu@gmail.com")
				.destino("tu@gmail.com")
				.assunto("Alta nas Vendas")
				.conteudo("Venho comunicar que esse mas tivemos um faturamento 20% maior");
		
		Email email1 = new Email(emailB);

//		ServicoEmail servico1 = new ServicoEmail();
//		LogEmail logEmail = new LogEmail(servico1);

//		logEmail.enviar(email1);

//		servico1.enviar(email1);

//		logEmail.enviar(email1);

//		TraducaoAssunto traducaoAssunto = new TraducaoAssunto(servico1, "Portuguese");
//		traducaoAssunto.enviar(email1);

		IServicoEmail finalService = new LogEmail(new TraducaoAssunto(new ServicoEmail(), "Portuguese"));
		IServicoEmail finalService2 = new LogEmail(
				new VariosDestinos(
						new TraducaoAssunto(
								new ServicoEmail(),
								"Portuguese"
						),
						"vh@beltra", "maits@beltra", "gael@beltra"
				)
		);

		finalService.enviar(email1);

		System.out.println();
		System.out.println();
		finalService2.enviar(email1);

	}

}
