package main.Provas.P2;

public class HTMLVisitor implements Visitor {

    private StringBuilder resultStringBuilder;

    public HTMLVisitor() {
        resultStringBuilder = new StringBuilder();
    }

    @Override
    public void visitElement(Elemento elemento) {
        resultStringBuilder.append(elemento.getConteudoHTML());
    }

    @Override
    public String toString() {
        return resultStringBuilder.insert(0, "<html><body>").append("</body></html>").toString();
    }
}
