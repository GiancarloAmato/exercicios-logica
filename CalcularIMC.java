import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite valor peso: ");
		Double Peso = scanner.nextDouble();
		
		System.out.print("Valor Peso: " + Peso);
		
		System.out.print("Digite valor da altura: ");
		Double Altura = scanner.nextDouble();
	
		Double resultado = Peso / (Altura * Altura);
		System.out.println("IMC: " + resultado);
		
		scanner.close();
		
		
	}
}
