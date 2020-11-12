package repaticao;

import javax.swing.JOptionPane;

public class ExemploWhile {

	public static void main(String[] args) {
		String email = JOptionPane.showInputDialog("Digite um email").toLowerCase();
		if (email.contains("@")==false) {
		 email = JOptionPane.showInputDialog("Digite o email com @").toLowerCase();
		}
		
		
		String nome = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
		while (nome.length()<=5 || nome.length()>10) {
			nome = JOptionPane.showInputDialog("Digite o nome novamente").toUpperCase();
			}
		
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		
		 
		}
		


}
