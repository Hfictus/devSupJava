//estudo de outras possibilidades
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

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try {
			
			List<Sale> sale = readSalesFromFile(path);
			
			printFiveSales2016(sale);
			
			printLoganSalesMonths1And7(sale);
			
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();
	}
	private static List<Sale> readSalesFromFile(String path) throws IOException {
		List<Sale> sale = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				sale.add(new Sale(
						Integer.parseInt(fields[0]),
						Integer.parseInt(fields[1]),
						fields[2],
						Integer.parseInt(fields[3]),
						Double.parseDouble(fields[4])
				));
				line = br.readLine();
			}
			
		}
		return sale;
	}

	private static void printFiveSales2016(List<Sale> sale) {
		List<Sale> sales2016 = sale.stream().filter(s -> s.getYear() == 2016)
				.sorted(Comparator.comparingDouble(Sale::averagePrice).reversed())
				.limit(5).collect(Collectors.toList());
		System.out.println("\nCinco primeiras vendas de 2016 de maior preço médio:");
		sales2016.forEach(System.out::println);
	}
	private static void printLoganSalesMonths1And7(List<Sale> sale) {
		double loganSales = sale.stream().filter(s -> (s.getSeller().equals("Logan")) && (s.getMonth() == 1 || s.getMonth() == 7))
				.map(s -> s.getTotal()).reduce(0.0, (x,y) -> x + y);
		
		System.out.printf(
			"\nValor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f\n", loganSales
		);
	}
}