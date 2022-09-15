/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.dao;

import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Consulta;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class ConsultaDAO {
    
    private static List<Consulta> consultas = new ArrayList<>();
    
    public static void salvarConsulta(Consulta consulta){
        consultas.add(consulta);
    }
    
    public static List<Consulta> getTodasConsultas(){
        return consultas;
    }
}
