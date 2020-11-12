package variaveis;

import javax.swing.JOptionPane;

public class Entrada {

	public static void main(String[] args) {
		// <tipo do dado> <nome da variavel/objeto>;
		// String (alfanumerico)
		// int [numeros inteiros] e double [numeros reais] (numerico)
		// tipo de referência: quando o tpoi se refere à uma classe
		
		
		String nome = JOptionPane.showInputDialog( "Digite seu nome" );
		//tipo primitivo: quando o tipo já pertence a linguagem (comeca com letra minuscula)
		//tipo primitivo precisa de um apoio. Esse apoio vem das classes "Wrappers".
		//int => Integer
		//double => Double
		//boolean => Boolean
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso"));
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade + " anos.");
		System.out.println("Altura.: " + altura + " metros.");
		System.out.println("Peso...: " + peso + " kilos ");
		
		double imc = peso / (altura * altura);
		//no prinf () usamos:
		// %s => para String
		// %f => para números reias
		// %d => para números inteiros
		System.out.printf( "IMC....: %.2f\n" , imc);
		System.out.printf( "%s seu imc é: %.2f\n" , nome,imc);
		
		
		
		
	}

}
