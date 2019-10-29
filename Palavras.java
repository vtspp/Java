import java.util.*;

public class Palavras {

	String nome;
	char[] n;

	public Palavras(String nome, char n[]) {
		this.nome = nome;
		this.n = n;
	}

	void palavNorm() {

		System.out.print("Normal: ");
		for (int a = 0; a < n.length; a++) {
			System.out.print(n[a]);
		}
		System.out.println();
	}

	void palavraInv() {

		System.out.print("Invertido: ");

		for (int b = n.length - 1; b >= 0; b--) {

			System.out.print(n[b]);
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Escreva uma palavra: ");
		String nome = sc.next();
		char[] n;
		n = nome.toCharArray();

		Palavras p = new Palavras(nome, n);
		p.palavNorm();  //Chama  método e envia o conteudo armazenado na variável "n" e posteriormente convertido em array para o laço for de "a".  
		p.palavraInv(); ////Chama  método e envia o conteudo armazenado na variável "n" e posteriormente convertido em array para o laço for de "b".

	}

}
