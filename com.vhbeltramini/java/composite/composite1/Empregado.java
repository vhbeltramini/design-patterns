package composite1;


public class Empregado extends MembroEmpresa {

	private double salario;

	public Empregado(String nome, double salario) {
		this.setNome(nome);
		this.salario = salario;
	}
	
	@Override
	public double getSalario() {
		return salario;
	}

}
