import java.util.Scanner;
import javax.swing.JOptionPane;

public class Cadastro {
	
	String nome, matricula, endereco;
	
	Cadastro ( String nome, String matricula, String endereco){
		
		nome = JOptionPane.showInputDialog("Nome do Aluno");
		this.nome = nome;
		matricula = JOptionPane.showInputDialog("Matrícula");
		this.matricula = matricula;
		endereco = JOptionPane.showInputDialog("Endereço");
		this.endereco = endereco;
	}
	
	void exibir() {
		
		JOptionPane.showMessageDialog(null, "Te Amo !!!!");
		
	}
	public static void main(String[] args) {
		
		Cadastro aluno = new Cadastro ("nome","matricula","endereco");
		aluno.exibir();

	}

}
