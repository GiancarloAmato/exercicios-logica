import java.util.Scanner;

public class DescontodeFrete {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final Integer frete = 15;
		
		System.out.println("Digite valor do produto: ");
		Integer valorProduto = scanner.nextInt();
		
		Boolean temDesconto = valorProduto >= 100;
		
		if (temDesconto) {
			System.out.println("Valor final: " + (valorProduto - frete));
		} else {
			System.out.println("Valor final: " + valorProduto);
			
			scanner.close();
		}
	}
}
