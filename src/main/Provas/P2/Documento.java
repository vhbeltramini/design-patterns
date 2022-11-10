package main.Provas.P2;

import java.util.ArrayList;
import java.util.List;

public class Documento {

    private List<Elemento> elementos = new ArrayList<>();

    public Documento() {
    }

    public void addElemento(Elemento elemento) {
        this.elementos.add(elemento);
    }

    public void accept(Visitor visitor) throws Exception {
        for (Elemento elemento:elementos)
            elemento.accept(visitor);
    }

}
