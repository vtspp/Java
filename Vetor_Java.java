import java.util.Scanner;

public class Vetor_Java {

	public static void main(String[] args) {
		
		Scanner mostrarDados = new Scanner(System.in);
		
		System.out.println("Insira seu nome: ");
		String nome = mostrarDados.nextLine();
	    int tamanho = nome.length();
	    //System.out.println("Tamanho do texto: " + tamanho);
	    // int t = tamanho; // trecho do código que contará de 0 à 23, devido a quantidade de caracteres.
	    //for (t = 0; t <= tamanho; t++) {
	    	//System.out.println(t);
	    //}
	    int [] aulaVetor = new int [tamanho];
	    System.out.println("Valor de Teste 1: ");
	    aulaVetor [0] = mostrarDados.nextInt();
	    System.out.println("Valor de Teste 2: ");
	    aulaVetor [1] = mostrarDados.nextInt() ;
	    System.out.println("Valor de Teste 3: ");
	    aulaVetor [2] = mostrarDados.nextInt();
	    
	    System.out.println("Nome do usuário: " + nome);
	    System.out.println("Tamanho do texto: " + tamanho);
	    System.out.println("Indíce 0: " + aulaVetor [0]);
	    System.out.println("Indíce 1: "+ aulaVetor [1]);
	    System.out.println("Indíce 2: "+ aulaVetor [2]);
	    
	  
	    
	    
	    
	    
	    
	    
		
		

	}

}
