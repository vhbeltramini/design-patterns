package main.Composite.composite3;

import java.util.ArrayList;

public class Postagem extends ComponenteSite {

    private ArrayList<ComponenteSite> componentesSite = new ArrayList<>();

    public void add(ComponenteSite componenteSite) {
        componentesSite.add(componenteSite);
    }

    public void remove(ComponenteSite componenteSite) {
        componentesSite.remove(componenteSite);
    }

    public ComponenteSite getComponenteSite(int index) {
        return componentesSite.get(index);
    }

    public Postagem(String titulo, String url) {
        super(titulo, url);
    }

    @Override
    public void imprimir() {
        System.out.println(this.titulo + " " + this.url);
        System.out.println();
        for (ComponenteSite comp : componentesSite) {
            comp.imprimir();
        }
    }
}
