import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;

public class Vendas extends JFrame {
    JButton botao1, botao2;
    JLabel imagem;
    JLabel rotulo1, rotulo4, rotulo5;
    JTextField texto1, texto4, texto5;
    MaskFormatter for1,for2,for3,for4,for5;
	public Vendas() {
		super("Menu de Venda");
		Container tela = getContentPane();
		setLayout(null);
		
		ImageIcon icone = new ImageIcon("img/icone.png");
		setIconImage(icone.getImage());		
        icone.setImage(icone.getImage().getScaledInstance(200, 190, 100));
		imagem = new JLabel(icone);

        rotulo1 = new JLabel("Id do Cliente");
        rotulo4 = new JLabel("Data da Venda");
        rotulo5 = new JLabel("Data prazo");

        try {
			
			for1  = new MaskFormatter("#####");
			for4 = new MaskFormatter("##/##/####");
            for5 = new MaskFormatter("##/##/####");
			
		} catch (ParseException e) {} 

        texto1 = new JFormattedTextField(for1);
		texto4 = new JFormattedTextField(for4);
        texto5 = new JFormattedTextField(for5);

		botao1 = new JButton("Cadastrar");
        botao2 = new JButton("Voltar");
        
		botao1.setBounds(150, 220, 130, 30);
        botao2.setBounds(300, 220, 130, 30);
        imagem.setBounds(280, 20, 200, 190);
		rotulo1.setBounds(50,  100, 100, 30);
        rotulo4.setBounds(50, 140, 100, 30);
        rotulo5.setBounds(50, 180, 100, 30);
		texto1.setBounds(150,  100, 100, 25);
		texto4.setBounds(150, 140,  100, 25);
        texto5.setBounds(150, 180,  100, 25);

		tela.add(rotulo1);
		tela.add(rotulo4);
		tela.add(rotulo5);
		tela.add(texto1);
		tela.add(texto4);
		tela.add(texto5);
        tela.add(imagem);


		tela.add(botao1);
		tela.add(botao2);
		
		botao1.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					String arquivo = "Vendas.txt";
					
					try {
						FileWriter fw = new FileWriter( arquivo, true );
						BufferedWriter bw = new BufferedWriter( fw );
	
						bw.write( rotulo1.getText()+": "+texto1.getText()+ " / ");
						bw.write( rotulo4.getText()+": "+texto4.getText()+ " / ");
						bw.write( rotulo5.getText()+": "+texto5.getText()+ " / ");
						bw.newLine();
						bw.close();
						fw.close();
	
						JOptionPane.showMessageDialog(null,"Salvo!\n Dados cadastrados com sucesso!");
	
						
					}catch(IOException ex){
						JOptionPane.showMessageDialog(null,"Erro!\n Arquivo!");
					}
					
				}
			}
		);
	
		botao2.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Inicio ini = new Inicio();
				ini.setVisible(true);
				setVisible(false);
				}
			}
		);
	

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setSize(500, 300);
		setVisible(true);

	}

	public static void main(String[] args) {

		Vendas app = new Vendas();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	


}
