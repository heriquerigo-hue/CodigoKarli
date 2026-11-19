import java.util.Scanner;
public class herique5 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int valorfinal = 0;
		System.out.println("Digite o código do produto: ");
		int prod = entrada.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		int quant = entrada.nextInt();
		switch(prod) {
			case 1:
				System.out.println("Produto escolhido: Boné.");
				valorfinal = 50 * quant;
			break;
			case 2:
				System.out.println("Produto escolhido: Calça.");
				valorfinal = 80 * quant;
			break;
			case 3:
				System.out.println("Produto escolhido: Tênis.");
				valorfinal = 150 * quant;
			break;
			default:
				System.out.println("Produto não encontrado.");
		}
		System.out.println("Valor final: " + valorfinal);
	}
}
