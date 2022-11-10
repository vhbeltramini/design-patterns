package main.Visitor.visitor6.visitor;


import main.Visitor.visitor6.equipe.Funcionario;

public class VisitorFimProjeto implements VisitorEmpresa {

    private String nomeProjeto;

    public VisitorFimProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    @Override
    public void visitFuncionario(Funcionario funcionario) {
        if (funcionario.getProjetoAtual().equals(this.nomeProjeto)) {
            funcionario.setProjetoAtual("");
        }
    }

}
