package main.Observer.observer3.observer3.sensores;

public class SensorTemperatura implements Sensor {

    @Override
    public double getMedicao() {
        return random.nextInt(20)+20;
    }
}
