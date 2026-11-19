import java.util.Scanner;
public class herique2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a média do aluno: ");
		float media = entrada.nextFloat();
		System.out.println("Digite a porcentagem de frequência do aluno: ");
		int freq = entrada.nextInt();
		if (media >= 7 && freq >= 75) {
			System.out.println("Aluno aprovado.");
		}
		else {
			System.out.println("Aluno reprovado.");
		}
	}
}
