
public class Busca_vetor {

	public static void main(String[] args) {
		
		char [] a = { 't','e','l','e','f','o','n','e'};
		char [] b = new char [10];
		System.arraycopy(a, 1, b, 0, 3);
		
		for (int i=0; i < b.length; i++) {
			 System.out.println("b[" + i + "]=" + b[i]);
			 }
	}

}
