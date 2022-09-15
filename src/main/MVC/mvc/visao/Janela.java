package main.MVC.mvc.visao;

import main.MVC.mvc.controle.LoteriasUC;
import main.MVC.mvc.controle.LoteriasUCImpl;
import main.MVC.mvc.observer.Observador;
import main.MVC.mvc.utils.SpringUtilities;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;


public class Janela extends JFrame implements Observador {

	private LoteriasUC loteria;
	
	public Janela() {
		loteria = new LoteriasUCImpl();
		loteria.addObservador(this);
		setTitle("Sorteio da Mega Sena");
		setSize(490, 150); // come�a mostrando 300, 300... depois 500, 300
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		initComponents();
		
	}
	
	private JButton[] bSortear = new JButton[6];
	private JLabel[] lSortear = new JLabel[6];
	private JLabel jlNumero;
	private JButton jbNovo;
	private JButton jbFim;
	
	private void initComponents() {
		
		JPanel jp1 = new JPanel();
		this.jbNovo= new JButton("Novo");
		
		jbNovo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				loteria.iniciarSorteio();
			}
			
		});
		
		JLabel jl1 = new JLabel("N�mero do sorteio : ");
		this.jlNumero = new JLabel("XX");
		
		jp1.add(jbNovo);
		jp1.add(jl1);
		jp1.add(jlNumero);
		
		add(jp1, BorderLayout.NORTH);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new SpringLayout());
		
		ActionListener sortear = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loteria.sortear();
			}
			
		};
		for (int i=0; i<6; i++) {
			bSortear[i] = new JButton("Sortear");
			bSortear[i].setEnabled(false);
			bSortear[i].addActionListener(sortear);
			jp2.add(bSortear[i]);
		}
		
		for (int i=0; i<6; i++) {
			lSortear[i] = new JLabel("XX");
			jp2.add(lSortear[i]);
		}
		
		SpringUtilities.makeCompactGrid(jp2,
                2, 6,
                3, 0,  //initX, initY // come�a mostrando 0, 0
                3, 3); //xPad, yPad

		add(jp2, BorderLayout.CENTER);
		
		JPanel jp3 = new JPanel();
		this.jbFim = new JButton("Finalizar");
		jbFim.setEnabled(false);
		jbFim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				loteria.finalizar();
			}
			
		});
		
		jp3.add(jbFim);
		add(jp3, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
        new Janela().setVisible(true);

	}

	@Override
	public void inicioSorteio(int numSorteio) {
		jlNumero.setText(numSorteio+"");
		bSortear[0].setEnabled(true);
		jbNovo.setEnabled(false);
	}

	@Override
	public void numSorteado(int idxNumero, int num) {
		
		lSortear[idxNumero].setText(""+num);
		bSortear[idxNumero].setEnabled(false);
		if (idxNumero < 5) {
			bSortear[idxNumero+1].setEnabled(true);
		} else {
			jbFim.setEnabled(true);
		}
		
	}

	@Override
	public void finalizado() {
		jbFim.setEnabled(false);
		jbNovo.setEnabled(true);
		
		for (int i=0; i<6; i++) {
			lSortear[i].setText("XX");
		}
		
	}

}
