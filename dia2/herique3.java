import java.util.Scanner;
public class herique3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a idade: ");
		int idade = entrada.nextInt();
		if (idade <= 12) {
			System.out.println("Atendimento infantil.");
		}
		else if (idade < 60) {
			System.out.println("Atendimento adulto.");
		}
		else {
			System.out.println("Atendimento preferencial.");
		}
	}
}
