import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.RegistrodeLog;

public class QuantidadeLog {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o caminho do arquivo: ");
		String path = sc.next();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			
			Set<RegistrodeLog>  set = new HashSet<>();
			
			try {
				String line = br.readLine();
				
				while (line != null) {
					
					String [] fields = line.split(" ");
					
					String name = fields [0];
					Date moment = Date.from(Instant.parse(fields[1]));
					
					set.add(new RegistrodeLog(name, moment));
					
					line = br.readLine();
				}
				
				System.out.print("Total users: " + set.size());
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		sc.close();

	}

}
