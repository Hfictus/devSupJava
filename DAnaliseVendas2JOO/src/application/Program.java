package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Sale;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Set<Sale> sellersList = new HashSet<>();
			List<Sale> fullSalesList = new ArrayList<>();
			
			String line = br.readLine();
			
			
			
			while(line != null) {
				String[] fields = line.split(",");
				fullSalesList.add(salesObjectInstantiation(fields));
				line = br.readLine();
			}
			
			
			
			
		}
		catch(IOException e) {
			System.out.print("Error: " + e.getMessage());
		}
		
		sc.close();
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
}