package main.Visitor.visitor6.visitor;


import main.Visitor.visitor6.equipe.Funcionario;

import java.util.HashMap;
import java.util.stream.Collectors;

public class VisitorMontarEquipe implements VisitorEmpresa {

    private String nomeProjeto;
    private HashMap <String, Integer> necessidades = new HashMap<>();

    public VisitorMontarEquipe(String nomeEquipe, HashMap<String, Integer> necessidades) {
        this.nomeProjeto = nomeEquipe;
        this.necessidades = necessidades;
    }

    @Override
    public void visitFuncionario(Funcionario funcionario) {
        if (funcionario.getProjetoAtual() != null && funcionario.getProjetoAtual().equals("")) {
            necessidades.forEach((funcao, quantidadeNecessaria) -> {
                if (quantidadeNecessaria > 0 && funcionario.getProjetoAtual().equals("")) {
                    if (funcionario.getFuncoes().stream().anyMatch(s -> s.equals(funcao))) {
                        funcionario.setProjetoAtual(nomeProjeto);
                    }
                    quantidadeNecessaria -= 1;
                    necessidades.put(funcao, quantidadeNecessaria);
                }
            });
        }
    }

}
