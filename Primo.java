import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Dígite um número para saber se é primo: ");

		int dividendo = sc.nextInt();
		int divisor;
		int controle = 0;

		for (divisor = 1; divisor <= dividendo; divisor++) {

			if (dividendo % divisor == 0) {

				controle++;
			}
		}

		if (controle == 2) {
			System.out.println("O número " + dividendo + " é primo.");
		} else {
			System.out.print("O número " + dividendo + " não é primo.");
		}
		sc.close;

	}
}
