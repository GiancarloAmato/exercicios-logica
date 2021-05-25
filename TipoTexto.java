import java.util.Scanner;

public class TipoTexto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		String nome = scanner.nextLine();
	
		System.out.println("Olá " + nome + "!");
		System.out.println("E qual seu sobrenome?");
		
		String sobrenome =scanner.nextLine();
		System.out.println("Bonito nome " + nome +" " + sobrenome + "!");
		
		scanner.close();
		
	}
}
