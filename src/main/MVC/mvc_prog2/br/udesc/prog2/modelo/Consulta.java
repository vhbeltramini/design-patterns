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
public class Consulta {
    
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;

    public Consulta() {
    }

    
    public Consulta(Paciente paciente, Medico medico, String data, String hora) throws ConsultaException {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        
        boolean validacao = validarConsulta(data);
        if(!validacao){
            throw new ConsultaException("Tentativa de marcar no sábado");
        }
        
    }

    private boolean validarConsulta(String data){
        if(data.equals("24/07/2021") || data.equals("25/07/2021")){
            return false;
        }
        else
            return true;
    }
    
    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Consulta{" + "paciente=" + paciente + ", medico=" + medico + ", data=" + data + ", hora=" + hora + '}';
    }

}
