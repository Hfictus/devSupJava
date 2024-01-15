//Uso de java.io com BufferedReader e FileReader.
package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		//String path = "c:\\temp\\in.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			List<Sale> sale = new ArrayList<>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				sale.add(new Sale(Integer.parseInt(fields[0]),
					Integer.parseInt(fields[1]),fields[2],
					Integer.parseInt(fields[3]),
					Double.parseDouble(fields[4])
				));
				line = br.readLine();
			}
			
			//lista das 5 maiores vendas na ordem decrescente:
			List<Sale> sales = sale.stream().filter(s -> s.getYear() == 2016)
				.sorted(Comparator.comparingDouble(Sale::averagePrice).reversed())
				.limit(5).collect(Collectors.toList());
						
			//imprimir 5 primeiros elementos			
			System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio:");
			sales.forEach(System.out::println);
					
			//Valor de vendas de Logan nos meses 1 e 7 de todos os anos:
			double loganSales = sale.stream()
					.filter(s -> (s.getSeller().equals("Logan") && 
					(s.getMonth() == 1 || s.getMonth() == 7)))
					.map(s -> s.getTotal()).reduce(0.0,(x,y) -> x + y);
			
			System.out.printf(
			   "\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f\n", loganSales
			);
			
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}

}