package main.Builder.builder3.produto;

import main.Builder.builder1_novaversao.builder.Carro;
import main.Builder.builder1_novaversao.builder.pecas.Motor;
import main.Builder.builder1_novaversao.builder.pecas.Pneu;

public class Pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String email;

	public Pessoa(PessoaBuilder pessoaBuilder) {
		this.nome = pessoaBuilder.nome;
		this.endereco = pessoaBuilder.endereco;
		this.telefone = pessoaBuilder.telefone;
		this.email = pessoaBuilder.email;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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

		public Pessoa.PessoaBuilder nome(String nome) {
			this.nome = nome;
			return this;
		}

		public Pessoa.PessoaBuilder endereco(String endereco) {
			this.endereco = endereco;
			return this;
		}

		public Pessoa.PessoaBuilder telefone(String telefone) {
			this.telefone = telefone;
			return this;
		}

		public Pessoa.PessoaBuilder email(String email) {
			this.email = email;
			return this;
		}

		public Pessoa build() {
			return new Pessoa(this);
		}
	}
	
}
