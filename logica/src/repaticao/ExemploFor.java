package repaticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		//sintaxe do comenado "for"
		// 1� => valor que come�a o la�o e variavel que vai contar
		// 2� => condi��o (at� quando ir� contar)
		// 3� => como ele vai contar? de 1 em 1?
		
	byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um numero"));
	for (int cont=0;cont<11;cont++) {
		System.out.println(tabuada + " X " + cont + " = " + (tabuada*cont));
	}

	}

}
