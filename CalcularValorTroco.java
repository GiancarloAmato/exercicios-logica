import console.Interacao;

public class CalcularValorTroco {

	public static void main(String[] args) {
		//Scanner scanner = new Scanner(System.in);
		
		Interacao interacao = new Interacao();
			
		//System.out.print("Digite o valor do produto: ");
		Double valorProduto = interacao.lerDecimal("Digite valor do produto:");
		
		//System.out.print("Valor produto: " + valorProduto);
		
		//System.out.print("Digite quantia passada pelo cliente: ");
		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantia passada pelo cliente: ");
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		//System.out.println("Troco:" + resultado);
		interacao.imprimir("Troco: " + resultado);
		
		//scanner.close();
		interacao.fechar();
	}
}
