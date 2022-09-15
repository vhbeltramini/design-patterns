package main.Observer.observer1.observer1;

public class Cliente {

    public static void main(String[] args) {
        Dados dados = new Dados(7, 3, 1);
        
        System.out.println("--- Inicial ---");
        Tabela t = new Tabela(dados);
        t.imprimir();
        
        GraficoBarra gb = new GraficoBarra(dados);
        gb.imprimir();
        
        dados.anexar(t);
        dados.anexar(gb);
        
        System.out.println("--- Alterar A = 10 ---");
        dados.setValorA(10);

        System.out.println("--- Alterar B = 20 ---");
        dados.setValorB(20);
        
        System.out.println("--- Alterar C = 15 ---");
        dados.setValorC(15);
    }
}
