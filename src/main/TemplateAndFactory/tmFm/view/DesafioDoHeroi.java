package main.TemplateAndFactory.tmFm.view;

import main.TemplateAndFactory.tmFm.control.ControleJogo;
import main.TemplateAndFactory.tmFm.control.ControleJogoImpl;
import main.TemplateAndFactory.tmFm.control.Observador;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.BorderLayout.*;


public class DesafioDoHeroi extends JFrame implements Observador {

	private static final long serialVersionUID = 1L;
	
	class HeroiTableModel extends AbstractTableModel {

		private static final long serialVersionUID = 1L;

		@Override
		public int getColumnCount() {
			return 3;
		}

		@Override
		public int getRowCount() {
			return 3;
		}

		@Override
		public Object getValueAt(int row, int col) {
			try {
				return controle.getPeca(col, row);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, e.toString());
				return null;
			}
		}
		
	}
	
	class HeroiRenderer extends DefaultTableCellRenderer {
	
		private static final long serialVersionUID = 1L;

		public Component getTableCellRendererComponent(JTable table,
				Object value, boolean isSelected, boolean hasFocus, int row,
				int column) {

			setIcon((ImageIcon) value);
			
			return this;
		}

	}

	private ControleJogo controle;
	private JTable tabuleiro;
	
	public DesafioDoHeroi() throws Exception {
		this.controle = new ControleJogoImpl();
		this.controle.inicializar();
		this.controle.addObservador(this);
		
		setTitle("Desafio do Her\u00F3i");
		setSize(305, 370);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);

		initComponents();
		pack();
	
	}

	private void initComponents() {

		// criar o tabuleiro e seus componentes
		tabuleiro = new JTable();
		tabuleiro.setModel(new HeroiTableModel());
		for (int x=0;x<tabuleiro.getColumnModel().getColumnCount();x++) {
			tabuleiro.getColumnModel().getColumn(x).setWidth(100);
			tabuleiro.getColumnModel().getColumn(x).setMinWidth(100);
			tabuleiro.getColumnModel().getColumn(x).setMaxWidth(100);
		}
		tabuleiro.setRowHeight(100);
		tabuleiro.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabuleiro.setShowGrid(false);
		tabuleiro.setIntercellSpacing(new Dimension(0, 0));
		tabuleiro.setDefaultRenderer(Object.class, new HeroiRenderer());

		tabuleiro.addKeyListener(new KeyAdapter(){
			
			@Override
			public void keyReleased(KeyEvent e) {
				try {
					controle.pressTecla( e.getKeyCode() );
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e1.toString());
				}
			}
			
		});
		
		
		add(tabuleiro, CENTER);

		JPanel jp = new JPanel();
		jp.setLayout(new BorderLayout());
		
		// criar os botoes de radio
		JPanel jrGrupo = new JPanel();

		ButtonGroup bgTipoHeroi = new ButtonGroup();
		
		jrMontanha = new JRadioButton("Montanha");
		jrMontanha.setSelected(true);
		jrMontanha.setActionCommand("Montanha");
		jrGrupo.add(jrMontanha);
		bgTipoHeroi.add(jrMontanha);
		
		jrAgua = new JRadioButton("\u00C1gua");
		jrGrupo.add(jrAgua);
		jrAgua.setActionCommand("Agua");
		bgTipoHeroi.add(jrAgua);
		
		ActionListener radioAction = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					controle.setTipoHeroi(event.getActionCommand());
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.toString());
				}
			}
		};
		jrMontanha.addActionListener(radioAction);
		jrAgua.addActionListener(radioAction);
		radioAction.actionPerformed(new ActionEvent(jrMontanha, ActionEvent.ACTION_PERFORMED, jrMontanha.getActionCommand()));
		
		jp.add(jrGrupo, WEST);
		
		// botao criar
		JPanel jpCriar = new JPanel();
		jbCriar = new JButton("Criar");
		jbCriar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent event) {
				try {
					if (jrMontanha.isSelected()) {
						controle.setTipoHeroi("Montanha");
					} else {
						controle.setTipoHeroi("Agua");
					}
					controle.run();

				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, e.toString());
				}
			}
		});
		
		jpCriar.add(jbCriar);
		jp.add(jpCriar, CENTER);
		
		add(jp, SOUTH);
		
		
	}

	private JRadioButton jrMontanha;
	private JRadioButton jrAgua;
	private JButton jbCriar;
	
	public static void main(String[] args) {
		try {
			DesafioDoHeroi d = new DesafioDoHeroi();
			d.setVisible(true);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.toString());
		}

	}

	@Override
	public void iniciouJogo() {
		jbCriar.setEnabled(false);
		jrMontanha.setEnabled(false);
		jrAgua.setEnabled(false);
	}

	@Override
	public void mudouTabuleiro() {
		tabuleiro.repaint();
	}

	@Override
	public void fimDeJogo(String msgErro) {
		JOptionPane.showMessageDialog(null, msgErro);
		System.exit(0);
	}

}
