import java.util.Scanner;
public class herique2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva dois números: ");
		float n1 = scanner.nextFloat(); // nextInt n dá certo pra numero quebrado
		float n2 = scanner.nextFloat();
		float rs = n1+n2;
		float rm = n1-n2;
		float rx = n1*n2;
		float rd = n1/n2;
		System.out.println("Soma: " + rs + " Subtração: " + rm + " Multiplicação: " + rx + " Divisão: " + rd);
	}
}