import java.util.Scanner;

public class Resolvido {
	String nome;
	String email;
	int numero;
	
	Resolvido (String nome, String email, int numero){
		this.nome = nome;
		this.email = email;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}


	public String getEmail() {
		return email;
	}
	
	public int getNumero() {
		return numero;
	}


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] q = new int [10];
		Resolvido [] quarto = new Resolvido [10];
		System.out.println("Quantos quartos serão alugados ? ");
		int n = sc.nextInt();
		String nome;
		String email;
		int numero = 0;
		
		for(int i = 0; i < n; i++) {
			System.out.print("Nome: ");
			nome = sc.next();
			System.out.print("Email: ");
			email = sc.next();
			System.out.print("Numero do quarto");
			numero = sc.nextInt();
			quarto [numero] = new Resolvido(nome, email, numero);
		}
		
		String r = null;
		
		for (int i = 0; i < n; i++) {
			r = quarto [numero].getNome();
		}
		System.out.println(r);

	}

}
