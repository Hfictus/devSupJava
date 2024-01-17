package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Sale;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Entre o caminho do arquivo: ");
		String filePath = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			
			List<Sale> fullSalesList = fullSalesListInstantiation(br);
						
			Map<String, Double> sellersList = totalSalesOfSellers(fullSalesList);
			
			printSellersList(sellersList);
			
			
		}
		catch(IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		sc.close();
	}
	
	private static List<Sale> fullSalesListInstantiation(BufferedReader br) throws IOException {
		List<Sale> fullSalesList = new ArrayList<>();
		String lineOfFile = br.readLine();
		while(lineOfFile != null) {
			String[] fields = lineOfFile.split(",");
			fullSalesList.add(salesObjectInstantiation(fields));
			lineOfFile = br.readLine();
		}
		return fullSalesList;
	}
	
	private static Sale salesObjectInstantiation(String[] fields) {
		return new Sale(
				Integer.parseInt(fields[0]),
				Integer.parseInt(fields[1]),
				fields[2],
				Integer.parseInt(fields[3]),
				Double.parseDouble(fields[4])
			);
	}
	
	private static Map<String,Double> totalSalesOfSellers(List<Sale> fullSalesList) {
		return fullSalesList.stream()
				.collect(
					Collectors.groupingBy(
						Sale::getSeller,
						Collectors.summingDouble(Sale::getTotal)
					)
				);
	}
		
	
	private static void printSellersList(Map<String, Double> sellersList) {
		System.out.println();
		sellersList.forEach((seller,total) -> {
			System.out.println(seller + ", " + String.format("%.2f", total));
		});
	}
	
}