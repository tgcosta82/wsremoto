package variaveis;

public class Tipos {

	public static void main(String[] args) {
		// <tipo do dado> <nome da variavel/objeto>;
		// String (alfanumerico)
		// int [numeros inteiros] e double [numeros reais] (numerico)
		
		String nome = "Thiago";
		int idade = 38;
		double altura = 1.78;
		double peso = 86.500;
		System.out.println("Nome...: " + nome);
		System.out.println("Idade..: " + idade + " anos.");
		System.out.println("Altura.: " + altura + " metros.");
		System.out.println("Peso...: " + peso + " kilos ");
		
		double imc = peso / (altura * altura);
		//no prinf () usamos:
		// %s => para String
		// %f => para n�meros reias
		// %d => para n�meros inteiros
		System.out.printf( "IMC....: %.2f\n" , imc);
		System.out.printf( "%s seu imc �: %.2f\n" , nome,imc);
		
		
		
		
	}

}
