import java.util.Scanner;
public class herique4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva a medida em metros: ");
		float metros = scanner.nextFloat();
		float cm = metros*100;
		System.out.println(metros + " metros em centímetros: " + cm);
		
	}
}