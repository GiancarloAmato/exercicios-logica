
public class TipoLogico {

	public static void main(String[] args) {
		
		Boolean variavelVerdadeira = true;
		System.out.println("Vari?vel verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Vari?vel falsa: " + variavelFalsa);
		
		System.out.println("-----------------------------");
		
		Integer idade = 19;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		// System.out.println("Pode tirar carteira?" + podeTirarCarteira );
		
		if (podeTirarCarteira) {
			System.out.println("Sim! pode tirar carteira. ");
		}else {
			System.out.println("N?o pode tirar carteira. ");
		}
		
	}
}
