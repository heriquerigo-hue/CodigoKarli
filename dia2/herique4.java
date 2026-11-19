import java.util.Scanner;
public class herique4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a nota final do aluno: ");
		float nota = entrada.nextFloat();
		System.out.println("Digite a frequência do aluno: ");
		int freq = entrada.nextInt();
		if (nota >= 6 && freq >= 75) {
			if (nota >= 9 && freq >= 90) {
				System.out.println("Aluno destacado.");
			}
			else {
				System.out.println("Aluno aprovado.");
			}
		}
		else if (freq >= 75) {
			System.out.println("Aluno em recuperação.");
		}
		else {
			System.out.println("Aluno reprovado por frequência.");
		}
	}
}
