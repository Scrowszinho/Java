import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class Produtos extends JFrame {

	JComboBox cbxIngredientes;
	JList lista;

	JButton addIngrediente, salvar, voltar;
	JLabel rotulo;
	JTextArea lanche;
	JTextField txtValor;
	JRadioButton balcao, entrega;
	ButtonGroup grupo;
	JScrollPane painelRolagem, painelRolagem2;
	DefaultListModel listModel;
    Double valor = 0.0, frete = 0.0;
    JLabel imagem;


	public Produtos() {

		super("Menu de Produtos");
		Container tela = getContentPane();
        setLayout(null);
        
        ImageIcon icone = new ImageIcon("img/icone.png");
		setIconImage(icone.getImage());		

		ProdProdutos prod = new ProdProdutos();
		addIngrediente = new JButton("Verificar");
		salvar = new JButton("Salvar");
		voltar = new JButton("Voltar");
		rotulo = new JLabel("Quantidade");
		cbxIngredientes = new JComboBox(prod.prodTipo);
		lanche = new JTextArea();
		txtValor =  new JTextField();
		// balcao = new JRadioButton("Balcao", true);
		// entrega = new JRadioButton("Entrega", false);
		// grupo = new ButtonGroup();
		
		// grupo.add(balcao);
		// grupo.add(entrega);
		
		
		//lista  = new JList();
		
		cbxIngredientes.setMaximumRowCount(3);
		cbxIngredientes.setBounds(20, 50, 100, 30);


		
		addIngrediente.setBounds(270, 50, 100, 30);
		// salvar.setBounds(270, 10, 100, 30);
		voltar.setBounds(270, 10, 100, 30);
		
		lanche.setBounds(270, 100, 120, 30);
		rotulo.setBounds(270, 190, 220, 30);

		txtValor.setBounds(270, 220, 100, 30);
		txtValor.setText("0");
		txtValor.setEnabled(false);
		
		// balcao.setBounds(20, 220, 80, 30);
		// entrega.setBounds(120, 220, 80, 30);

		addIngrediente.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					lanche.append(lista.getSelectedValue().toString() + "\n");
					valor += prod.prodValor[cbxIngredientes.getSelectedIndex()][lista.getSelectedIndex()];
					txtValor.setText("" + prod.prodQuanti[cbxIngredientes.getSelectedIndex()][lista.getSelectedIndex()]);
				}
			}
		);
		
		// salvar.addActionListener(
		// 	new ActionListener() {
		// 		public void actionPerformed(ActionEvent e) {
				
		// 			String arquivo = "dados.txt";
		// 			String separador = ";";
					
		// 			try {
		// 				FileWriter fw = new FileWriter( arquivo, true );
		// 				BufferedWriter bw = new BufferedWriter( fw );

		// 				bw.write( lanche.getText().replace('\n', ';') );
		// 				bw.newLine();

		// 				bw.close();
		// 				fw.close();

		// 				JOptionPane.showMessageDialog(null,"Salvo!\n Dados cadastrados com sucesso!");


		// 			}catch(IOException ex){
		// 				JOptionPane.showMessageDialog(null,"Erro!\n Arquivo!");
		// 			}
					
		// 		}
		// 	}
		// );
		
		
		listModel = new DefaultListModel();
		
		cbxIngredientes.addItemListener(
			new ItemListener() {
				
				public void itemStateChanged(ItemEvent event) {
					if (event.getStateChange() == ItemEvent.SELECTED) {
						int tipo = cbxIngredientes.getSelectedIndex();
						listModel = new DefaultListModel();  
						for (int i = 0; i < prod.produtos[tipo].length; i++) {
							listModel.addElement(prod.produtos[tipo][i]);
						}
					}
					lista.setModel(listModel);
				}
			
			}
		);
		
		lista = new JList(prod.produtos[0]);
		lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		painelRolagem = new JScrollPane(lista);
		painelRolagem2 = new JScrollPane(lanche);

		painelRolagem.setBounds(20, 100, 150, 100);
		painelRolagem2.setBounds(200, 100, 150, 100);

		// balcao.addActionListener(
		// 	new ActionListener() {
		// 		public void actionPerformed(ActionEvent e) {
		// 			frete = 0.0;
		// 			txtValor.setText("" + (valor + frete));
		// 		}
		// 	}
		// );

		// entrega.addActionListener(
		// 	new ActionListener() {
		// 		public void actionPerformed(ActionEvent e) {
		// 			frete = 2.5;
		// 			txtValor.setText("" + (valor + frete));
		// 		}
		// 	}
		// );

        voltar.addActionListener(
			new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				Inicio ini = new Inicio();
				ini.setVisible(true);
				setVisible(false);
				}
			}
		);
		
		tela.add(cbxIngredientes);
		tela.add(painelRolagem);
		// tela.add(painelRolagem2);
		tela.add(addIngrediente);
		tela.add(salvar);
		tela.add(voltar);
		tela.add(rotulo);
		// tela.add(balcao);
		// tela.add(entrega);
		tela.add(txtValor);
		setSize(400, 300);
		setVisible(true);
		setResizable(false);
	}

	public static void main(String[] args) {
		
		Produtos app = new Produtos();
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
