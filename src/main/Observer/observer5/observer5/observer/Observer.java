package main.Observer.observer5.observer5.observer;

public interface Observer {

    void atualizaQuantidadeAtual(int quantidadeAtual);
    void atualizaStatusQuantidadeCritica(int quantidadeAtual, int quantidaeCritica);
    void quantidadeAdicionada(int quantidadeAdicionada);
    void quantidaeRetirada(int quantidadeRemovida);

}
