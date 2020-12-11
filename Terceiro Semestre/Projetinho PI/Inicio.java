import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Inicio extends JFrame {
	JButton botao1, botao3, botao4, botao;
	JLabel imagem;
	public Inicio() {
		super("Menu Inicial");
		Container tela = getContentPane();
		setLayout(null);
		
		ImageIcon icone = new ImageIcon("img/icone.png");
		setIconImage(icone.getImage());		

		botao = new JButton("Comprar");
		botao1 = new JButton("Vendas");
		botao3 = new JButton("Fornecedores");
		botao4 = new JButton("Produtos");
		icone.setImage(icone.getImage().getScaledInstance(200, 190, 100));
		imagem = new JLabel(icone);

		botao.setBounds(50, 20, 130, 30);
		botao1.setBounds(50, 60, 130, 30);
		botao3.setBounds(50, 100, 130, 30);
		botao4.setBounds(50, 140, 130, 30);
		imagem.setBounds(220, 20, 200, 190);
		

		tela.add(botao1);
		tela.add(botao3);
		tela.add(botao4);
		tela.add(botao);
		tela.add(imagem);
		//

		botao3.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Fornecedores fornecedores = new Fornecedores();
				fornecedores.setVisible(true);
				setVisible(false);
				}
			}
		);

		botao4.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Produtos produtos = new Produtos();
				produtos.setVisible(true);
				setVisible(false);
				}
			}
		);

		botao1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Vendas vendas = new Vendas();
				vendas.setVisible(true);
				setVisible(false);
				}
			}
		);

		botao.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Comprar comp = new Comprar();
				comp.setVisible(true);
				setVisible(false);
				}
			}
		);

		//
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		Inicio app = new Inicio();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	private void botao(java.awt.event.ActionEvent event){
	Comprar obj = new Comprar();
	obj.setVisible(true);
	
	}


}
