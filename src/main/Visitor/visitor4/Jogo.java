package main.Visitor.visitor4;

import main.Visitor.visitor4.personagens.Arqueiro;
import main.Visitor.visitor4.personagens.Catapulta;
import main.Visitor.visitor4.personagens.Lanceiro;
import main.Visitor.visitor4.visitor.VistorAtaqueCatapulta;
import main.Visitor.visitor4.visitor.VistorAtaqueLanceiro;

public class Jogo {

    public static void main(String[] args) throws Exception {

        Lanceiro lan1 = new Lanceiro();
        Lanceiro lan2 = new Lanceiro();

        Catapulta cat1 = new Catapulta();
        Catapulta cat2 = new Catapulta();

        System.out.println(lan1.getPontoVida());

        VistorAtaqueCatapulta ataqueCatapulta = new VistorAtaqueCatapulta(cat1);
        lan1.accept(ataqueCatapulta);

        System.out.println(lan1.getPontoVida());


        VistorAtaqueLanceiro al = new VistorAtaqueLanceiro(lan2);
        lan1.accept(al);

        System.out.println(lan1.getPontoVida());

        lan1.accept(al);
        lan1.accept(al);

        System.out.println(lan1.getPontoVida());


        Arqueiro arq1 = new Arqueiro();
        Arqueiro arq2 = new Arqueiro();



    }

}

