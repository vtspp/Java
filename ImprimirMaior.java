package entities.service;

import java.util.Scanner;

public class ImprimirMaior {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		PrintService<Integer> ps = new PrintService<>();
		
		for (int i = 0; i < n; i++) {
			
			Integer value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		System.out.print("First: " + ps.first());
		sc.close();

	}

}
