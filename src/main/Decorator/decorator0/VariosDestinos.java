package main.Decorator.decorator0;

public class VariosDestinos extends ServicoEmailDecorator {

    private String[] destinos;

    public VariosDestinos(IServicoEmail servicoEmail, String... destines) {
        super(servicoEmail);
        destinos = destines;
    }

    @Override
    public void enviar(Email email) {
        super.enviar(email);
        for (String destinatario : destinos) {
            email.setDestino(destinatario);
            super.enviar(email);
        }
    }

}
