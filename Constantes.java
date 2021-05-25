import java.util.Scanner;

public class Constantes {
	static final Integer IDADE_MINIMA_PARA_TIRAR_CARTA = 18;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final Integer idadeMinimaParaTirarCarta = 18;

		System.out.print("Idade: ");
		Integer idade = scanner.nextInt();

		Boolean podeTirarCarteira = idade >= idadeMinimaParaTirarCarta;

		if (podeTirarCarteira) {
			System.out.println("Sim! pode tirar carteira. ");
		} else {
			System.out.println("Não pode tirar carteira. ");
			
			scanner.close();
		}
	}
}