package main.Command.command4.br.udesc.ppr55.command4.Command;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class AdicionarQuadrado implements Command {

	private List<String> desenhos = new ArrayList<>();
	private int width;
	private int height;
	private int length;
	private int corId;

	private Color[] cores = new Color[]{Color.BLACK,Color.BLUE,Color.YELLOW,Color.GREEN, Color.RED, Color.WHITE};


	private int qtdade;

	public AdicionarQuadrado(List<String> desenhos, int width, int height, int length, int cor) {
		this.desenhos = desenhos;
		this.width = width;
		this.height = height;
		this.length = length;
	}
	
	@Override
	public void execute() {
		desenhos.add("quad,"+width+","+height+","+cores[corId].getRGB());
	}

	@Override
	public void undo() {
		desenhos.remove("quad,"+width+","+height+","+cores[corId].getRGB());
	}

	@Override
	public void redo() {
		desenhos.add("quad,"+width+","+height+","+cores[corId].getRGB());
	}

}
