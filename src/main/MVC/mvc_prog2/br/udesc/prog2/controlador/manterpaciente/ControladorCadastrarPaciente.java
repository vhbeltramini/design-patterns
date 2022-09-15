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
public class ControladorCadastrarPaciente {
//    private TelaCadastrarPaciente telaCadastrarPaciente;
    private Paciente modeloPaciente;
    private List<ObserverCadastro> observerCadastros = new ArrayList<>();

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

    public ControladorCadastrarPaciente() {
//        this.telaCadastrarPaciente = telaCadastrarPaciente;
        this.modeloPaciente = new Paciente();
//        adicionarAcoes();
    }

    public void salvarPaciente(String nome, String cpf){
        modeloPaciente = new Paciente(nome, cpf);
        if(validarPaciente()){
            if(PacienteDAO.salvarPaciente(modeloPaciente)){
                notificarExibirMensagem("Paciente salvo com sucesso. " + modeloPaciente);
                notificarAtualizaTela();
            }
            else {
                notificarExibirMensagem("Já existe paciente com esse CPF");
            }
        }
        else {
            notificarExibirMensagem("Nome/CPF vazio");
        }
    }
    
    public boolean validarPaciente(){
        if (this.modeloPaciente.getNome().equals(""))
            return false;
        if (this.modeloPaciente.getCPF().equals(""))
            return false;
        return true;
    }

}
