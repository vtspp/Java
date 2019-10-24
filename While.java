
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		
		Scanner x = new Scanner (System.in);
		System.out.println("Insira um valor inicial: ");
		int teste = x.nextInt();
		
		while (teste <= 40) {
			System.out.println("Valor alterado: " + teste++);
			
			
		
		}
		
		
		int resultado = media();
		System.out.println(resultado);
		
	}
	
	public static int media() {
		
		Scanner nota = new Scanner (System.in);
		System.out.println("Entre com 4 notas e pressione enter.");
		
		int n1 = nota.nextInt();
		int n2 = nota.nextInt();
		int n3 = nota.nextInt();
		int n4 = nota.nextInt();
		int resultado = n1 + n2 + n3 + n4;
				return resultado;
	}

}
