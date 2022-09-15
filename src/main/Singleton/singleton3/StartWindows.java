package main.Singleton.singleton3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

@SuppressWarnings("serial")
public class StartWindows extends JDialog {

	private static Random sorteio = new Random();
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public StartWindows() {
		setResizable(false);
		setTitle("Teste");
		
	 	addWindowListener(new WindowAdapter() {
	            public void windowClosing(WindowEvent evt) {
	                System.exit(0);
	            }
	     });
		
		JButton jb = new JButton("Abrir");
		
		ActionListener action = new ActionListener() {

		public void actionPerformed(ActionEvent arg) {

			JDialog jinc = new JDialog() {

				@Override
				public void pack() {
					setResizable(true);
					int x = sorteio.nextInt(screenSize.width -100);
					int y = sorteio.nextInt(screenSize.height-100);
					setLocation(x, y);

					final Contador contador = Contador.getInstance();
					final JLabel jl = new JLabel(contador.getCount()+"");
					JButton jb = new JButton("Add");
					jb.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {
							contador.incrementCount();

							jl.setText(contador.getCount()+"");
						}
					});


					getContentPane().add(jl, "North");
					getContentPane().add(jb, "South");

					super.pack();
					setVisible(true);
					}
					
					
				};
				jinc.pack();
				
			}

		};
		jb.addActionListener(action);
		
		getContentPane().add(jb);
		
		pack();
		setLocationRelativeTo(null);
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new StartWindows();
	}

}
