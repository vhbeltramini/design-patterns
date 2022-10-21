package main.Strategy.strategy2.loja;

public class ItemVenda {

	private double precoUnit;
	private double qtdade;
	
	public ItemVenda(double precoUnit, double qtdade) {
		super();
		this.precoUnit = precoUnit;
		this.qtdade = qtdade;
	}

	public double getPrecoUnit() {
		return precoUnit;
	}
	public void setPrecoUnit(double precoUnit) {
		this.precoUnit = precoUnit;
	}
	public double getQtdade() {
		return qtdade;
	}
	public void setQtdade(double qtdade) {
		this.qtdade = qtdade;
	}
}
