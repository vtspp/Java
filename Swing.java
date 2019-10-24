import javax.swing.JOptionPane;
public class Swing {

	public static void main(String[] args) {
		
		String num1, num2;
		int n1, n2, soma;
		
		num1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		n1 = Integer.parseInt(num1);
		num2 = JOptionPane.showInputDialog("Digite o segundo valor");
		n2 = Integer.parseInt(num2);
		
		soma = n1+n2;
		
		JOptionPane.showMessageDialog (null,"Total: "+soma);

	}

}
