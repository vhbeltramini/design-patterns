package main.Decorator.decorator0;

public class Email {

	private String remetente;
	private String destino;
	private String assunto;
	private String conteudo;

	public Email(EmailBuilder builder) {
		this.remetente = builder.remetente;
		this.destino = builder.destino;
		this.assunto = builder.assunto;
		this.conteudo = builder.conteudo;
	}

	public String getRemetente() {
		return remetente;
	}

	public String getDestino() {
		return destino;
	}

	public String getAssunto() {
		return assunto;
	}

	public String getConteudo() {
		return conteudo;
	}
	
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}



	public static class EmailBuilder {
		
		private String remetente;
		private String destino;
		private String assunto;
		private String conteudo;
		
		public EmailBuilder remetente(String remetente) {
			this.remetente = remetente;
			return this;
		}
		
		public EmailBuilder destino(String destino) {
			this.destino = destino;
			return this;
		}
		
		public EmailBuilder assunto(String assunto) {
			this.assunto = assunto;
			return this;
		}
		
		public EmailBuilder conteudo(String conteudo) {
			this.conteudo = conteudo;
			return this;
		}
	}

	
	
}
