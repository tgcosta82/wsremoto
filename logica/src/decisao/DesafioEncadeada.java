package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usuário
		 * se é alfabetizado (1) ou não (0)
		 * Se ele não for alfabetizado não vota
		 * Altere o código abaixo para a melhor estrtutura de decisão
		 */
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Digite <1> para alfabetizado"));
		if (alfabetizado==1) { 
			String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
			short idade = Short.parseShort(JOptionPane.showInputDialog("idade")); 
			if (idade<16) {
				System.out.println(nome + " você ainda não pode votar.");
			}else if (idade>=18 && idade<=70) {
				System.out.println(nome + " você é obrigado a votar.");
			}else {
				System.out.println(nome + " o seu voto é facultativo.");

			}
		}else {



		}

	}
