import javax.swing.*;
import java.awt.*;

public class Inicio extends JFrame {
	JButton botao1, botao2, botao3, botao4, botao;
	JLabel imagem;
	public Inicio() {
		super("Menu Inicial");
		Container tela = getContentPane();
		setLayout(null);
		
		ImageIcon icone = new ImageIcon("img/icone.png");
		setIconImage(icone.getImage());		
		imagem = new JLabel(icone);

		botao = new JButton("Comprar");
		botao1 = new JButton("Vender");
		botao2 = new JButton("Clientes");
		botao3 = new JButton("Fornecedores");
		botao4 = new JButton("Produtos");

		botao.setBounds(50, 20, 130, 30);
		botao1.setBounds(50, 60, 130, 30);
		botao2.setBounds(50, 100, 130, 30);
		botao3.setBounds(50, 140, 130, 30);
		botao4.setBounds(50, 180, 130, 30);

		tela.add(botao1);
		tela.add(botao2);
		tela.add(botao3);
		tela.add(botao4);
		tela.add(botao);
		tela.add(imagem);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		Inicio app = new Inicio();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
