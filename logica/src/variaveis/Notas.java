package variaveis;

import javax.swing.JOptionPane;

public class Notas {
	/* TODO Auto-generated method stub
	* solicitar um nome de aluno e duas notas, calcular a média
	*e exibir uma mensagem para o aluno da seguinte forma:
	*"Aluno xxxx", sua médio obtida foi: xxxx para 10 faltaram: xxxx pontos""
	*/ 

	public static void main(String[] args) {
	
		String Aluno = JOptionPane.showInputDialog( "Digite seu nome" );
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2"));
		double media = (nota1+nota2)/2;
		System.out.println("Aluno " + Aluno + ", sua média obtida foi: " + media + " para 10 faltaram: " + (10-media) + "pontos");
		
		/* Tipos primitivos
		 * boolean => Boolean => treu ou false
		 * char => Character => 1 caracter ('w')
		 * 
		 * São inteiros
		 * short => Short (-127/+128)
		 * byte => Byte (-32.../ +32...)
		 * int => Integer (-2bi/+2bi)
		 * 
		 * São os reais
		 *float => Float (para poucas casas decimais)
		 *double => Double (para muitas casas decimais)
		 */

			


	}

}
