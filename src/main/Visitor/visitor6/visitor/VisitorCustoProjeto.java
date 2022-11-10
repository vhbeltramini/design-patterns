package main.Visitor.visitor6.visitor;

import main.Visitor.visitor6.equipe.Funcionario;

import java.util.HashMap;

public class VisitorCustoProjeto implements VisitorEmpresa {

    private String nomeProjeto;
    private HashMap<String, Double> custoProjetos = new HashMap<>();

    public VisitorCustoProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    @Override
    public void visitFuncionario(Funcionario funcionario) {
        if (funcionario.getProjetoAtual() != null && funcionario.getProjetoAtual().equals(nomeProjeto)) {
            if (custoProjetos.containsKey(nomeProjeto)) {
                double valortotal = custoProjetos.get(nomeProjeto) + funcionario.getSalario();
                custoProjetos.put(nomeProjeto, valortotal);
                return;
            }
            custoProjetos.put(nomeProjeto, funcionario.getSalario());
        }
    }

    public String getCustoProjetos() {
        StringBuilder st = new StringBuilder();
        custoProjetos.forEach((project, cost) -> st.append("Projeto : ").append(project).append(", Custo total : ").append(cost).append("\n"));
        return st.toString();
    }
}
