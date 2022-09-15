package main.Singleton.singleton1;

public class Singleton {
	
	private Singleton() { }
	
	private static Singleton instance;
	
	public synchronized static Singleton getInstance() {
		if (instance == null)
			instance = new Singleton();
		
		return instance;
	}

	public void facaAlgo() {
		System.out.println("Eu fiz");
	}
}
