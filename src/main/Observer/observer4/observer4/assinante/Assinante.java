package main.Observer.observer4.observer4.assinante;

import main.Observer.observer4.observer4.observer.Observer;
import main.Observer.observer4.observer4.revista.Edicao;
import main.Observer.observer4.observer4.revista.Revista;

public class Assinante implements Observer {

    private String nome;
    private String endereco;

    public Assinante(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNomeAssinante() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnderecoAssinante() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public void atualizaVersao(Revista revista, Edicao edicao) {
        System.out.println("Assinate{" +
                "Nome do assinate ='" + getNomeAssinante() + '\'' +
                "Endereco do assinate ='" + getEnderecoAssinante() + '\'' +
                "Revista='" + revista.getNomeRevista() + '\'' +
                "Edicao='" + edicao.getNumeroEdicao() + '\'' +
                '}');
    }
}
