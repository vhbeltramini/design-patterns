/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.dao;

import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Consulta;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Medico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class MedicoDAO {
    
    private static List<Medico> medicos = new ArrayList<>(
            List.of(
                    new Medico[]{
                            new Medico("Ana", "1123"),
                            new Medico("Matheus", "1456"),
                            new Medico("Gabriel", "1789")
                    }
            )
    );
    
    public static void salvarMedico(Medico medico){
        medicos.add(medico);
    }

    public static List<Medico> getMedicos(){
        return medicos;
    }
}
