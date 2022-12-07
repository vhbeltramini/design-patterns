package main.Composite.composite3;

public abstract class ComponenteSite {

    protected String titulo;
    protected String url;

    public ComponenteSite(String titulo, String url) {
        this.titulo = titulo;
        this.url = url;
    }

    public abstract void imprimir();

}
