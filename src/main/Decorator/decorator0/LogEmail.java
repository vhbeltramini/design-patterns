package main.Decorator.decorator0;

public class LogEmail extends ServicoEmailDecorator {

    public LogEmail(IServicoEmail servicoEmail) {
        super(servicoEmail);
    }

    @Override
    public void enviar(Email email) {
        System.out.println("## Log: Sending email from " + email.getRemetente() + " to " + email.getDestino());
        super.enviar(email);
    }

}
