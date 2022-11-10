package main.Visitor.visitor3.visitor;

import main.Visitor.visitor3.empresa.FuncNivelA;
import main.Visitor.visitor3.empresa.FuncNivelB;
import main.Visitor.visitor3.empresa.Gerente;

public class CalcGozarFerias implements FuncionarioVisitor {

    private int totalFuncGozaramFerias;

    @Override
    public void visitGerente(Gerente gerente) {
        if (gerente.getSalario() > 5000) {
            gerente.setFeriasAGozar(gerente.getFeriasAGozar()-10);
            totalFuncGozaramFerias ++;
//            System.out.println(gerente.toString().concat("gozou 5 dias de ferias"));
        }
    }

    @Override
    public void visitFuncNivelA(FuncNivelA funcionario) {
        if (funcionario.getSalario() > 5000) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar()-10);
            totalFuncGozaramFerias ++;
//            System.out.println(funcionario.toString().concat("gozou 5 dias de ferias"));
        }
    }

    @Override
    public void visitFuncNivelB(FuncNivelB funcionario) {
        if (funcionario.getSalario() > 1500) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar()-5);
            totalFuncGozaramFerias ++;
//            System.out.println(funcionario.toString().concat("gozou 5 dias de ferias"));
        }
    }

    public int getTotalFuncGozaramFerias() {
        return totalFuncGozaramFerias;
    }
}
