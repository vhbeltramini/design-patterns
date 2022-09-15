/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.dao;

import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Paciente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class PacienteDAO {
    
    private static List<Paciente> pacientes = new ArrayList<>();
    
    public static boolean salvarPaciente(Paciente paciente){
        for(Paciente p : pacientes){
            if(p.getCPF().equals(paciente.getCPF()))
                return false;
        }
        pacientes.add(paciente);
        return true;
    }
    
    public static List<Paciente> getTodosPaciente(){
        return pacientes;
    }
    
    public static boolean excluirPaciente(String CPF){
        for(Paciente p : pacientes){
            if(p.getCPF().equals(CPF)){
                pacientes.remove(p);
                return true;
            }
        }
        return false;
    }
    
}
