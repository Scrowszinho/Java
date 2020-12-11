/*
 * NovaJanela2.java
 * 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NovaJanela2 extends JFrame {

	JButton abrir;
	Inicial segundajanela;

	public NovaJanela2() {
		super("Abrir uma nova janela");
		Container tela = getContentPane();
		tela.setLayout(null);

		abrir = new JButton("Abrir");
		abrir.setBounds(100,50,80,20);
		
		abrir.addActionListener(
			new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					segundajanela = new Inicial(null, "Segunda Janela", false);
					segundajanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					segundajanela.setVisible(true); 
				} 
			} 
		);
		tela.add(abrir);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(300, 150);
		setVisible(true);
		setLocationRelativeTo(null);
	}

	public static void main(String args[]) {
		NovaJanela2 app = new NovaJanela2();
	}

	private class Inicial extends JDialog {

		JButton sair;

		public Inicial(Frame owner, String title, boolean modal) {
			super(owner, title, modal);
			Container tela1 = getContentPane();
			tela1.setLayout(null);

			sair = new JButton("Sair");
			sair.setBounds(50,50,100,20);

			TBsair tsair = new TBsair();
			sair.addActionListener(tsair);

			tela1.add(sair);

			setSize(200,200);
			setLocationRelativeTo(null);
		} 
	}

	private class TBsair implements ActionListener {
		public void actionPerformed(ActionEvent evento) {
			int status = JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o programa?", "Mensagem de saída", JOptionPane.YES_NO_OPTION);

			if (status == JOptionPane.YES_OPTION) {
				segundajanela.setVisible(false);
				segundajanela.dispose();
			}
		}
	}
}
