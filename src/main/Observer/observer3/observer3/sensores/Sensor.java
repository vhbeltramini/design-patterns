package main.Observer.observer3.observer3.sensores;

import java.util.Random;

public interface Sensor {

	static Random random = new Random();

	double getMedicao();
}
