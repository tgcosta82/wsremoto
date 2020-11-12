package repaticao;

import javax.swing.JOptionPane;

public class ExemploFor {

	public static void main(String[] args) {
		//sintaxe do comenado "for"
		// 1º => valor que começa o laço e variavel que vai contar
		// 2º => condição (até quando irá contar)
		// 3º => como ele vai contar? de 1 em 1?
		
	byte tabuada = Byte.parseByte(JOptionPane.showInputDialog("Digite um numero"));
	for (int cont=0;cont<11;cont++) {
		System.out.println(tabuada + " X " + cont + " = " + (tabuada*cont));
	}

	}

}
