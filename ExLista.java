import java.util.Scanner;

public class ExLista {

	String id, nome;
	int salario, qt;

	public ExLista(String id, String nome, int salario, int qt) {

		this.id = id;
		this.nome = nome;
		this.salario = salario;
		this.qt = qt;
	}

	private String getId() {
		return id;
	}

	private String getNome() {
		return nome;
	}

	private int getSalario() {
		return salario;
	}

	void mostrarCadastro(String id, String nome, int salario, int qt) {
		ExLista[] funcionario = new ExLista[qt];

		for (int i = 0; i < qt; i++) {
			System.out.println(funcionario[i].getId());
			System.out.println(funcionario[i].getNome());
			System.out.println(funcionario[i].getSalario());
		}
	}

	void aumentarSalario(int salario) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Qual a pocentagem de aumento? ");
		int x = sc.nextInt();
		int ajuste = salario / 100 * x + salario;
	}

	void verificaId(String id, String nome) {

		if (id != nome) {
			System.out.println("Identificação incorreta");

		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantidade de funcionarios: ");
		int qt = sc.nextInt();
		String id;
		String nome;
		int salario;

		ExLista[] funcionario = new ExLista[qt];

		for (int i = 0; i < qt; i++) {

			id = sc.next();
			nome = sc.next();
			salario = sc.nextInt();

			funcionario[i] = new ExLista(id, nome, salario, qt);
		}

		
		System.out.println("Informe o id do funcionário que receberá ajuste no Salário: ");
		
		//ExLista funcionarioCad = new ExLista (id, nome, salario, qt);
	}

}
