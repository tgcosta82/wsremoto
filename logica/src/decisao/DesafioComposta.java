package decisao;

import javax.swing.JOptionPane;

public class DesafioComposta {

	public static void main(String[] args) {
		/*
		 * Solicita o nome de um produto e a qtde em estoque
		 * Se a qtde estiver entre 20 e 40 deve retornar "Estoque normal"
		 * Se a qtde estiver entre 41 e 60 deve retornar "estoque alto"
		 * Se a qtde for mario que 60 deve retornar "estoque lotado"
		 * Se a qtde for menor que 20 deve retornar "estoque baixo"
		 */
		String produto = JOptionPane.showInputDialog("Digite o produto").toUpperCase();
		int qtde = Integer.parseInt(JOptionPane.showInputDialog("Qtde"));
		if (qtde<20) {
			System.out.println("Estoque baixo");
		}else if (qtde>60) {
			System.out.println("Estoque lotado");
		}else if(qtde>=20 && qtde<=40) {
			System.out.println("Estoque normal");
		}else {
			System.out.println("Estoque alto");
		}
		
		

	}

}
