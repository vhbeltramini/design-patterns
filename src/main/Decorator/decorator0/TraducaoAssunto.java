package main.Decorator.decorator0;

public class TraducaoAssunto extends ServicoEmailDecorator {

    private final Object idioma;

    public TraducaoAssunto(IServicoEmail servicoEmail, String idioma) {
        super(servicoEmail);
        this.idioma = idioma;
    }

    @Override
    public void enviar(Email email) {
        email.setAssunto(email.getAssunto() + " -- automatic translated to " + idioma);
        super.enviar(email);
    }

}
