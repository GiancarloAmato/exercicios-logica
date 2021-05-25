import java.util.Scanner;

public class PercentualDeDesconto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite quantidade produto: ");
		Integer quantidadeProduto = scanner.nextInt();

		Double subTotal = quantidadeProduto * valorProduto;
		System.out.print("Sub-total: " + subTotal);

		Boolean comDesconto = quantidadeProduto >= 10;
		Double desconto = 10.0;
		if (comDesconto) {
			Double promocao = subTotal * desconto / 100;
			System.out.println(" Com desconto. " + (subTotal - promocao));
		} else {
			System.out.println(" Sem desconto. " + subTotal);
			
			scanner.close();

		}
	}
}