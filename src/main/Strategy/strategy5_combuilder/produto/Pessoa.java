package main.Strategy.strategy5_combuilder.produto;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	
	private Pessoa(PessoaBuilder pb) {
		this.nome = pb.nome;
		this.endereco = pb.endereco;
		this.telefone = pb.telefone;
		this.email = pb.email;
	}
	
	public String getNome() {
		return nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	
	@Override
	public String toString() {
		return nome + " - " + endereco + " - " + telefone + " - " + email;
	}
	
	public static class PessoaBuilder {
		
		private String nome;
		private String endereco;
		private String telefone;
		private String email;
		
		public void reset() {
			this.nome = null;
			this.endereco = null;
			this.telefone = null;
			this.email = null;
		}

		public Pessoa build() {
			Pessoa p = new Pessoa(this);
			
			return p;
		}
		
		public PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public PessoaBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public PessoaBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public PessoaBuilder email(String email) {
			this.email = email;
			return this;
		}
	}
	
}
