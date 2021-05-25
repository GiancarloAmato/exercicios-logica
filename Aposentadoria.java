import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Idade: ");
		Integer idadeMinima = scanner.nextInt();

		System.out.print("Tempo contribuição previdência: ");
		Integer contribuicaoPrevidencia = scanner.nextInt();

		final Boolean podeAposentarIdade = idadeMinima >= 55;
		final Boolean podeAposentarContribuicao = contribuicaoPrevidencia >= 25;
		
		if (podeAposentarIdade && podeAposentarContribuicao) {
			System.out.print("Pode aposentar! ");
		} else  {
			System.out.print("Não pode aposentar ");
			
			scanner.close();
			
			}
		}
	}
