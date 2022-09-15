package main.Command.command3.br.udesc.pp55.command3.dao;

import main.Command.command3.br.udesc.pp55.command3.modelo.Pessoa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class BancoPessoas {

	// Singleton Eager Instantiation
	private static BancoPessoas instance = new BancoPessoas();

	private Map<Integer, Pessoa> pessoasMap = new HashMap<>();

	private BancoPessoas() {
		pessoasMap.put(1, new Pessoa(1, "Alan Turing"));
		pessoasMap.put(2, new Pessoa(2, "Ada Byron"));
		pessoasMap.put(3, new Pessoa(3, "Richard Feynmann"));
		pessoasMap.put(4, new Pessoa(4, "Mario Schenberg"));
	}

	public static BancoPessoas getInstance() {
		return instance;
	}

	public Pessoa getPessoa(int id) {
		return pessoasMap.get(id);
	}

	public Pessoa removerPessoa(int id) {
		return pessoasMap.remove(id);
	}

	public Pessoa[] getAll() {
		Collection<Pessoa> all = pessoasMap.values();
		Pessoa[] buffer = new Pessoa[all.size()];
		return (Pessoa[]) all.toArray(buffer);
	}

	public int addPessoa(int id, String nome) {
		if (!pessoasMap.containsKey(id)) {
			pessoasMap.put(id, new Pessoa(id, nome));
			return id;
		} else {
			return addPessoa(id + 1, nome);
		}
	}
}
