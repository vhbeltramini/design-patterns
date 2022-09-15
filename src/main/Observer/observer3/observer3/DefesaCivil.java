package main.Observer.observer3.observer3;

import main.Observer.observer3.observer3.dispositivos.DispositivoConsole;
import main.Observer.observer3.observer3.dispositivos.DispositivoWindow;
import main.Observer.observer3.observer3.estacao.EstacaoMeteorologica;
import main.Observer.observer3.observer3.sensores.SensorTemperatura;
import main.Observer.observer3.observer3.sensores.SensorUmidade;

public class DefesaCivil {

    public void abrir () {

        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        estacao.setSensorTemp(new SensorTemperatura());
        estacao.setSensorUmidade(new SensorUmidade());

        DispositivoConsole console = new DispositivoConsole();

        DispositivoWindow window = new DispositivoWindow();

        estacao.ligar();
    }

    public static void main(String[] args) throws InterruptedException {

        DefesaCivil dc = new DefesaCivil();
        dc.abrir();

        while (true) {
                Thread.sleep(2000);
        }
    }


}
