import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Students;

public class TotalAlunos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many students for curse A ? ");

		Set<Students> a = new HashSet<>();

		Integer n = sc.nextInt();
		Integer count = 0;
		for (int i = 0; i < n; i++) {

			Integer id = sc.nextInt();
			a.add(new Students(id));

		}

		System.out.print("How many students for curse B ? ");

		Set<Students> b = new HashSet<>(a);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			Integer id = sc.nextInt();
			b.add(new Students(id));
		}

		System.out.print("How many students for curse C ? ");

		Set<Students> c = new HashSet<>(b);

		n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			Integer id = sc.nextInt();
			c.add(new Students(id));
		}

		System.out.print("Total students: " + c.size());

		sc.close();

	}

}
