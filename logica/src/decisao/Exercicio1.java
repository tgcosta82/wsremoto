package decisao;

import javax.swing.JOptionPane;

public class Exercicio1 {

	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Valor1"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Valor2"));
		String operador = JOptionPane.showInputDialog("Digite o operador");
		if (operador.equals("+")) {
			System.out.println("O resultado é: " + (valor1+valor2));
		}else if (operador.equals("-")) {
			System.out.println("O resultado é: " + (valor1-valor2));
		}else if (operador.equals("*")) {
			System.out.println("O resultado é: " + (valor1*valor2));
		}else if (operador.equals("/")) {
			if (valor2!=0) {
				System.out.println("O resultado é: " + (valor1/valor2));
			}else {
				System.out.println("O segundo valor não pode ser zero");
			}
		}else {
			System.out.println("Digite um operador válido");
		} 





	}

}
