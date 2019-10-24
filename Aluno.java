import java.util.Scanner;

public class Aluno {
	
	private String nome, matricula;
	private float n1, n2, n3, n4, media;
	
	Aluno(String nome, String matricula){
		
		this.nome = nome;
		this.matricula = matricula;
	}
	
	void cadastro() {
		Scanner cadastro = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = cadastro.nextLine();
		System.out.println("Digite sua matricula: ");
		matricula = cadastro.next();
	}
	
	float calMedia() {
		
		Scanner calMedia = new Scanner(System.in);
		System.out.println("Nota do 1º Bimestre:");
		n1 = calMedia.nextFloat();
		System.out.println("Nota do 2º Bimestre:");
		n2 = calMedia.nextFloat();
		System.out.println("Nota do 3º Bimestre:");
		n3 = calMedia.nextFloat();
		System.out.println("Nota do 4º Bimestre:");
		n4 = calMedia.nextFloat();
		media = (n1+n2+n3+n4)/4;
		return media;
	}
	
	void mostrarResultado() {
		if (media >= 60) {
			System.out.println("Aluno "+nome+" foi aprovado com média de " + media + " pontos.");
		}else {
			System.out.println("Aluno "+nome+" está reprovado.");
		}
	}
	
	public class Professor extends Aluno {
		
	    double salario;
		
	public Professor(String nome, String matricula, double salario){
			
		super(nome, matricula);
		this.salario = salario;
			
		}
	
	public double getSalario() {
		return this.salario;
	}
	
	public void setSalario() {
		this.salario = salario;
	}
	
	
	double salProfessor(double salario) {
		salario = 8000;
		return salario;
	}

	public  void main(String[] args) {
		
		Aluno aluno = new Aluno("nome", "matricula");
		aluno.cadastro();
		aluno.calMedia();
		aluno.mostrarResultado();
		
		//Aluno professor = new Professor(nome, matricula, salario);
		//professor.cadastro();
		

	}

}
	}
