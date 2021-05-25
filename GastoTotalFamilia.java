import java.util.Scanner;

public class GastoTotalFamilia {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		

		System.out.print("Digite valor da conta de luz: ");
		Double contaLuz = scanner.nextDouble();
		
		System.out.print("Digite valor da conta de água: ");
		Double contaAgua = scanner.nextDouble();
		
		System.out.print("Digite valor da conta de telefone: ");
		Double valorTelefone = scanner.nextDouble();

		System.out.print("Digite valor da escola do filho: ");
		Double valorEscola = scanner.nextDouble();

		System.out.print("Digite valor da fatura cartão: ");
		Double faturaCartao = scanner.nextDouble();

		System.out.print("Digite valor gasto supermercado: ");
		Double valorSupermercado = scanner.nextDouble();
		
		Double gastoTotalFamilia = (contaLuz + valorTelefone + contaAgua + valorEscola + faturaCartao + valorSupermercado );
		System.out.println("Valor Total: " + gastoTotalFamilia);
		
		scanner.close();
	}
}
