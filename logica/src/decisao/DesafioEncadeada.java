package decisao;

import javax.swing.JOptionPane;

public class DesafioEncadeada {

	public static void main(String[] args) {
		/*
		 * Acrescente uma captura de dado, perguntando ao usu�rio
		 * se � alfabetizado (1) ou n�o (0)
		 * Se ele n�o for alfabetizado n�o vota
		 * Altere o c�digo abaixo para a melhor estrtutura de decis�o
		 */
		byte alfabetizado = Byte.parseByte(JOptionPane.showInputDialog("Digite <1> para alfabetizado"));
		if (alfabetizado==1) { 
			String nome = JOptionPane.showInputDialog("Aluno").toUpperCase();
			short idade = Short.parseShort(JOptionPane.showInputDialog("idade")); 
			if (idade<16) {
				System.out.println(nome + " voc� ainda n�o pode votar.");
			}else if (idade>=18 && idade<=70) {
				System.out.println(nome + " voc� � obrigado a votar.");
			}else {
				System.out.println(nome + " o seu voto � facultativo.");

			}
		}else {



		}

	}
