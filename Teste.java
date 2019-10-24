import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("**** Teste de Pilha ****");
		
		System.out.println("Dígite ( ) { } [ ]");
		
		String [] str = new String [5];
		str [0] = sc.next();
		str [1] = sc.next();
		str [2] = sc.next();
		str [3] = sc.next();
		str [4] = sc.next();
		str [5] = sc.next();

		int topo = 0;
		String pilha[] = {"(", ")", "{", "}", "[", "]"};

		for (int i = 0; i < pilha.length; i++) {

			if(str[0] == pilha[i]) {
				
			}
			
			System.out.println(var);
			

			// if (dividendo % divisor == 0) {

			// controle++;
		}
	}

	/*
	 * if (controle == 2) { System.out.println("O número " + dividendo +
	 * " é primo."); } else { System.out.print("O número " + dividendo +
	 * " não é primo."); }
	 * 
	 * }
	 */

