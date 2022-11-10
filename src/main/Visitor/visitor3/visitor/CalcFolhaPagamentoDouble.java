package main.Visitor.visitor3.visitor;

import main.Visitor.visitor3.empresa.FuncNivelA;
import main.Visitor.visitor3.empresa.FuncNivelB;
import main.Visitor.visitor3.empresa.Gerente;

public class CalcFolhaPagamentoDouble implements FuncionarioVisitor {

    private double totalSalario = 0.0;

    public double getTotalSalario() {
        return totalSalario;
    }

    @Override
    public void visitGerente(Gerente gerente) {
        totalSalario += gerente.getSalario();
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        totalSalario += funcionario.getSalario();
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        totalSalario += funcionario.getSalario();
    }

}
