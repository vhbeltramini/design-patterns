package main.AbstractFactory.abstractfactory3.view;

import main.AbstractFactory.abstractfactory3.controle.abstractfactory.Destino;
import main.AbstractFactory.abstractfactory3.controle.observer.Observador;
import main.AbstractFactory.abstractfactory3.controle.uc.CalculadoraFreteControle;
import main.AbstractFactory.abstractfactory3.controle.uc.CalculadoraFreteImpl;
import main.AbstractFactory.abstractfactory3.utils.SpringUtilities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraFreteView extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;
	private static final String PRECOCALCULADO = "Pre\u00e7o calculado : R$ ";
	
	private CalculadoraFreteControle controle;
	private JButton ok;
	private JRadioButton rbExpresso;
	private JRadioButton rbNormal;
	private ButtonGroup group2;
	
	private JLabel jlPrecoCalc;

	public CalculadoraFreteView() {
		
		this.controle = new CalculadoraFreteImpl();
		this.controle.addObservador(this);
		
		setTitle("Calculadora de Frete");
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setSize(400, 290);

		setResizable(false);
		setLocationRelativeTo(null);

		initComponents();
	}
	
	private void initComponents() {
		
		JPanel jp0 = new JPanel();
		jp0.setBackground(new Color(165, 202, 255));
		jlPrecoCalc = new JLabel(PRECOCALCULADO + "0");
		jp0.add(jlPrecoCalc);
		add(jp0, BorderLayout.NORTH);
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new SpringLayout());
		
		jp1.add(new JLabel("Altura (cm) : "));
		JTextField tfAltura = new JTextField();
		jp1.add(tfAltura);
		
		jp1.add(new JLabel("Largura (cm) : "));
		JTextField tfLarg = new JTextField();
		jp1.add(tfLarg);
		
		jp1.add(new JLabel("Profundidade (cm) : "));
		JTextField tfProf = new JTextField();
		jp1.add(tfProf);

		jp1.add(new JLabel("Peso (gr) : "));
		JTextField tfPeso = new JTextField();
		jp1.add(tfPeso);
		
		jp1.add(new JLabel("Destino : "));
		DefaultComboBoxModel<Destino> cbModel = new DefaultComboBoxModel<Destino>(Destino.values());
		JComboBox<Destino> cbDestino = new JComboBox<>(cbModel);
		jp1.add(cbDestino);
		
		jp1.add(new JLabel("Tipo de Frete : "));
		
		JPanel jpRadioButtons1 = new JPanel();
		jpRadioButtons1.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ActionListener rbClick1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controle.setTipoFrete(e.getActionCommand());
			}
		};
		
		JRadioButton rbCorreio = new JRadioButton("Correio");
		rbCorreio.setActionCommand("Correio");
		rbCorreio.addActionListener(rbClick1);
		
		JRadioButton rbExportar = new JRadioButton("Exportar America do Norte");
		rbExportar.setActionCommand("Exportar");
		rbExportar.addActionListener(rbClick1);
		
		jpRadioButtons1.add(rbCorreio);
		jpRadioButtons1.add(rbExportar);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rbCorreio);
		group1.add(rbExportar);
		
		jp1.add(jpRadioButtons1);
		
		jp1.add(new JLabel("Tipo de Encomenda : "));
		
		JPanel jpRadioButtons2 = new JPanel();
		jpRadioButtons2.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ActionListener rbClick2 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				controle.setTipoEncomenda(e.getActionCommand());
			}
		};
		
		this.rbExpresso = new JRadioButton("Expresso");
		rbExpresso.setActionCommand("Expresso");
		rbExpresso.addActionListener(rbClick2);
		rbExpresso.setEnabled(false);
		
		this.rbNormal = new JRadioButton("Normal");
		rbNormal.setActionCommand("Normal");
		rbNormal.addActionListener(rbClick2);
		rbNormal.setEnabled(false);
		
		jpRadioButtons2.add(rbExpresso);
		jpRadioButtons2.add(rbNormal);
		
		this.group2 = new ButtonGroup();
		group2.add(rbExpresso);
		group2.add(rbNormal);
		
		jp1.add(jpRadioButtons2);
		
		// apenas para ajeitar a posicao dos componentes na tela
		SpringUtilities.makeCompactGrid(jp1, 7, 2, 3, 3, 3, 3);
		add(jp1, BorderLayout.CENTER);
		
		JPanel jp2 = new JPanel();
		
		this.ok = new JButton("Calcular");
		ok.setEnabled(false);
		ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				controle.calcularFrete(
						Integer.parseInt(tfAltura.getText()),
						Integer.parseInt(tfLarg.getText()),
						Integer.parseInt(tfProf.getText()),
						Integer.parseInt(tfPeso.getText()),
						(Destino)cbDestino.getSelectedItem());
			} 
		});
		jp2.add(ok);
		
		add(jp2, BorderLayout.SOUTH);
		
		
	}

	public static void main(String[] args) {
		new CalculadoraFreteView().setVisible(true);
	}

	@Override
	public void tipoFreteSetado() {
		
		rbExpresso.setEnabled(true);
		rbNormal.setEnabled(true);
		
		group2.clearSelection();
		ok.setEnabled(false);
	}

	@Override
	public void msgErro(String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public void tipoEncomendaSetado() {
		ok.setEnabled(true);
	}

	@Override
	public void notificarPrecoCalculado(double preco) {
		jlPrecoCalc.setText(PRECOCALCULADO + preco);		
	}

}
