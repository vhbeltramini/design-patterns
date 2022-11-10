package main.Provas.P2;

public class BBCodeVisitor implements Visitor {

    private StringBuilder resultStringBuilder;

    public BBCodeVisitor() {
        resultStringBuilder = new StringBuilder();
    }

    @Override
    public void visitElement(Elemento elemento) {
        resultStringBuilder.append(elemento.getConteudoBBCode());
    }

    @Override
    public String toString() {
        return resultStringBuilder.toString();
    }
}
