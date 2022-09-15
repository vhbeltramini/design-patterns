/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.modelo;

import main.MVC.mvc_prog2.br.udesc.prog2.excecoes.ConsultaException;

/**
 *
 * @author matth
 */
public class Funcionario extends Pessoa {
    
    public Funcionario(String nome, String CPF) {
        super(nome, CPF);
    }
    
    public static Consulta marcarConsulta(Paciente paciente, Medico medico, String data, String hora) throws ConsultaException {
        Consulta consulta = new Consulta(paciente, medico, data, hora);
        return consulta;
    }
    
}
