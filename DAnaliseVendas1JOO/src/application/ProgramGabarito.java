package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.SaleGabarito;

public class ProgramGabarito {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Entre o caminho do arquivo: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<SaleGabarito> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				int month = Integer.parseInt(fields[0]);
				int year = Integer.parseInt(fields[1]);
				int items = Integer.parseInt(fields[3]);
				double total = Double.parseDouble(fields[4]);

				list.add(new SaleGabarito(month, year, fields[2], items, total));

				line = br.readLine();
			}

			List<SaleGabarito> q1 = list.stream()
					.filter(s -> s.getYear() == 2016)
					.sorted((s1, s2) -> s2.averagePrice().compareTo(s1.averagePrice()))
					.limit(5)
					.collect(Collectors.toList());

			System.out.println();
			System.out.println("Cinco primeiras vendas de 2016 de maior preço médio");
			for (SaleGabarito sale: q1) {
				System.out.println(sale);
			}

			double q2 = list.stream()
					.filter(s -> s.getMonth() == 1 || s.getMonth() == 7)
					.filter(s -> s.getSeller().equals("Logan"))
					.map(s -> s.getTotal())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.println();
			System.out.printf("Valor total vendido pelo vendedor Logan nos meses 1 e 7 = %.2f%n", q2);
			
		} 
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}
}