package main.Decorator.decorator0;

// Passo 4 - criar decorator
public abstract class ServicoEmailDecorator implements IServicoEmail {


    // Passo 5.1 - Na classe do item 4 fazer um atributo do tipo Componente.
    private IServicoEmail servicoEmail;

    // Passo 5.2 -  Esse atributo é inicializado no construtor;
    public ServicoEmailDecorator(IServicoEmail servicoEmail) {
        this.servicoEmail = servicoEmail;
    }

    // Passo 6 - Redirecione os métodos do decorador para a implementação da classe decorada;
    @Override
    public void enviar(Email email) {
        servicoEmail.enviar(email);
    }

}
