package main.Singleton.singleton2.meusistema.fiscal;

public class CalcImposto {
	
	private CalcImposto() {
		
	}
	
	private static CalcImposto instance;

	public synchronized static CalcImposto getInstance() {
		if (instance == null) 
			instance = new CalcImposto();
		
		return instance;
	}
	
	private float aliquota;
	
	public float getAliquota() {
		return aliquota;
	}
	
	public void setAliquota(float aliquota) {
		this.aliquota = aliquota;
	}
	
	public float calcImposto(float valor) {
		return valor * aliquota / 100;
	}
	
}
