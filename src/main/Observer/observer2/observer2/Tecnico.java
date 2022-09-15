package main.Observer.observer2.observer2;


public class Tecnico implements Observador {

    private String sistema;
    private String nome;

    public Tecnico(String nome, String sistema) {
        this.nome = nome;
        this.sistema = sistema;
    }

    @Override
    public String receberMensagem(String mensagem) {
        if (mensagem.contains(sistema)) {
                return "Resposta do "+nome+ ": Ligar para 41 736354";
        }
        return null;
    }

}
