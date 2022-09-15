/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.modelo;

/**
 *
 * @author matth
 */
public class Paciente extends Pessoa {
       
    public Paciente(String nome, String CPF) {
        super(nome, CPF);
    }

    public Paciente() {
        super("", "");
    }
}

