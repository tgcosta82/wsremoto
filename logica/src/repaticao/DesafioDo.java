package repaticao;

import javax.swing.JOptionPane;

public class DesafioDo {

	public static void main(String[] args) {   
	
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�"));
		int chute = 0;
		int contador=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o n�"));
			contador=contador+1;
			if (numero>chute) {
				System.out.println("Chute mais alto");
			}else if (numero<chute) {
				System.out.println("Chute mais baixo");
			}
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou com" + contador + " tentativa(s)");


	}

}
