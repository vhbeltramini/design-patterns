/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.controlador.manterpaciente;

import main.MVC.mvc_prog2.br.udesc.prog2.dao.PacienteDAO;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Paciente;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author matth
 */
public class ControladorListarPacientes {
    private List<ObserverCadastro> observerCadastros = new ArrayList<>();

    public ControladorListarPacientes() {
    }

    public void anexar(ObserverCadastro obs) {
        this.observerCadastros.add(obs);
    }

    public void remove(ObserverCadastro obs) {
        this.observerCadastros.remove(obs);
    }

    public void notificarExibirMensagem(String message) {
        for (ObserverCadastro obs: observerCadastros)
            obs.exibirMensagem(message);
    }

    public void notificarAtualizaTela() {
        for (ObserverCadastro obs: observerCadastros)
            obs.atualizaTela();
    }

    public List<Paciente> getPacientes() {
        return PacienteDAO.getTodosPaciente();
    }

    public void excluirPaciente(String cpf){
        if(PacienteDAO.excluirPaciente(cpf)){
            notificarExibirMensagem("Paciente excluido com sucesso");
            notificarAtualizaTela();
        }
        else {
            notificarExibirMensagem("Não foi possível excluir o paciente");
        }
    }
    
}
