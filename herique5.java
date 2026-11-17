import java.util.Scanner;
public class herique5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva a idade da pessoa em anos: ");
		int anos = scanner.nextInt();
		int dias = anos*365;
		System.out.println("Aproximadamente " + dias + " dias de idade.");
	}
}