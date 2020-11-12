package repaticao;

public class DesafioWhile {

	public static void main(String[] args) {
		short ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano"));
		while (ano<=1900 || ano>=2002) {
			ano = Short.parseShort(JOptionPane.showInputDialog("Digite o ano novamente"));
		}
		
		

	}

}
