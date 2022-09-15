package main.Singleton.singleton2.meusistema.fiscal;

public class TestarCalcImposto {

	public static void main(String[] args) {
		CalcImposto ci = CalcImposto.getInstance();
		
		ci.setAliquota(5);
		
		System.out.println(ci.calcImposto(100));
	}
	
}
