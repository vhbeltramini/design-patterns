package main.Observer.observer3.observer3.sensores;

public class SensorUmidade implements Sensor {

    @Override
    public double getMedicao() {
        return random.nextInt(70)+30;
    }

}
