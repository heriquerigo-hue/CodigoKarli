import java.util.Scanner;
public class herique6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva o nome de usuário, a idade e se a conta está ativa (true/false): ");
		String nome = scanner.nextLine();
		int idade = scanner.nextInt();
		boolean ativo = scanner.nextBoolean();
		System.out.println("Usuário: " + nome + ", Idade: " + idade + ", Conta ativa: " + ativo);
		
	}
}