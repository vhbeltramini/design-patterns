package main.Singleton.singleton3;

public class Contador {
	private int count = 0;
	
	private Contador() { }
	
	private static Contador instance;
	
	public synchronized static Contador getInstance() {
		if (instance == null) 
			instance = new Contador();
		
		return instance;
	}
	
	public int getCount() {
		return count;
	}

	public void incrementCount() {
		this.count++;
	}
	
	
}
