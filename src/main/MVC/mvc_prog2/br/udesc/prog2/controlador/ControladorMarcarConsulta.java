/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.MVC.mvc_prog2.br.udesc.prog2.controlador;

import main.MVC.mvc_prog2.br.udesc.prog2.controlador.manterpaciente.ObserverCadastro;
import main.MVC.mvc_prog2.br.udesc.prog2.dao.ConsultaDAO;
import main.MVC.mvc_prog2.br.udesc.prog2.dao.MedicoDAO;
import main.MVC.mvc_prog2.br.udesc.prog2.dao.PacienteDAO;
import main.MVC.mvc_prog2.br.udesc.prog2.excecoes.ConsultaException;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Consulta;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Funcionario;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Medico;
import main.MVC.mvc_prog2.br.udesc.prog2.modelo.Paciente;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author matth
 */
public class ControladorMarcarConsulta {
    private Consulta modelConsulta;
    private List<ObserverCadastro> observerCadastros = new ArrayList<>();

    public ControladorMarcarConsulta() {
        modelConsulta = new Consulta();
        popularDadosTela();
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

    public void popularDadosTela(){
        notificarAtualizaTela();
    }

    public List<Paciente> getPacientes() {
        return PacienteDAO.getTodosPaciente();
    }

    public List<Medico> getMedicos() {
        return MedicoDAO.getMedicos();
    }

    public void marcarConsulta(Medico medico, Paciente paciente, String data, String hora) {
        try {
            Consulta consulta = Funcionario.marcarConsulta(paciente, medico, data, hora);
            ConsultaDAO.salvarConsulta(consulta);
            notificarAtualizaTela();
            notificarExibirMensagem("Consulta Marcada com sucesso");
            System.out.println(ConsultaDAO.getTodasConsultas());
        } catch (ConsultaException ex) {
            notificarExibirMensagem("Erro: Você está tentando agendar uma consulta para o sábado");
        }
    }
    
    
    
}
