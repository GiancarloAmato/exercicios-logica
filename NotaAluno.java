
public class NotaAluno {
	
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);

		Boolean variavelFalsa = false;
		System.out.println("Variável falsa: " + variavelFalsa);

		System.out.println("-----------------------------");

		Integer nota = 100;

		final Boolean estaAprovado = nota >= 70;

		if (estaAprovado) {
			System.out.println("Aprovado! ");
		} else {
			System.out.println("Reprovado. ");
		}
	}
}
