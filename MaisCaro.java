package entities.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MaisCaro {

	public static void main(String[] args) {

		String path = "C:\\Java\\produtos.csv";

		List<Product> list = new ArrayList<>();

		try {
			BufferedReader bf = new BufferedReader(new FileReader(path));

			try {
				String line = bf.readLine();

				while (line != null) {
					String[] produtos = line.split(",");
					list.add(new Product(produtos[0], Double.parseDouble(produtos[1])));
					line = bf.readLine();
				}

				System.out.println("Produto mais caro:");
				System.out.println(CalculationService.max(list));

			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

	}

}
