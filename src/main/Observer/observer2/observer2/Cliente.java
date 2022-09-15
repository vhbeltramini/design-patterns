package main.Observer.observer2.observer2;


public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarResposta(String mensagem, String resposta) {
        System.out.println("Em relacao a sua mensagem [" + mensagem + "]");
        System.out.println(" A resposta foi (" + resposta + ")");
    }
}
