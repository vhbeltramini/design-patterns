package main.Observer.observer2.observer2;

public class AnalistaChefe implements Observador {

    @Override
    public String receberMensagem(String mensagem) {
            if (mensagem.contains("Windows")) {
                    return "Resposta do analisa chefe: Troca de Sistema";
            }
            return null;
    }

}
