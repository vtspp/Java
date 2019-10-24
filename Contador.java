import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um valor: ");
		
		double x = sc.nextInt();
		
		while (x <300000000) {
			
			x++;
			
			System.out.println(x);
		}
		
		

	}

}
