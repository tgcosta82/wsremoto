package variaveis;

public class ManupulaString {

	public static void main(String[] args) {
		String email = "xpTo@itau-Unibanco.COM.br";
	    System.out.println("Original: " + email);
	    System.out.println("Minuscula: " + email.toLowerCase());
	    System.out.println("Maiuscula: " + email.toUpperCase());
	    System.out.println("Qtde de Caracteres: " + email.length());
	    System.out.println("Tem arroba? " + email.contains("@"));
	    System.out.println("Posição do @: " + email.indexOf("@"));
	    System.out.println("Do 2º até 4º: " + email.substring(1,5));
	    // quero que exibam a primeira metada do email
	    System.out.println("Primeira metade: " + email.substring(0, email.length()/2));
	    System.out.println("Usuario: " + email.substring(0, email.indexOf("@")));
	    System.out.println("Servidor: " + email.substring(email.indexOf("@")+1).toLowerCase());
	    System.out.println("Comparação: " + email.equals("xpto@itau-unibanco.com.br"));
	    System.out.println("Comparação: " + email.equalsIgnoreCase("xpto@itau-unibanco.com.br"));
	}

}
