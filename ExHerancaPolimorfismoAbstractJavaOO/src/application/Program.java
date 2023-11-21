package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			String name = "";
			double anualIncome = 0.0;
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char individualOrCompany = sc.next().charAt(0);
			if(individualOrCompany == 'i' || individualOrCompany == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("Anual income: ");
				anualIncome = sc.nextDouble();
			}
			switch (individualOrCompany) {
			case 'i':
				System.out.print("Health Expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
				break;
			case 'c':
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
				break;
			}
		}
				
		System.out.println(taxesPaid(list));
		System.out.printf("TOTAL TAXES: $ %.2f\n", totalTax(list));
		
		sc.close();
	}
	
	public static String taxesPaid(List<TaxPayer> list) {
		StringBuilder sb = new StringBuilder();
		sb.append("\nTAXES PAID\n");
		for(TaxPayer nameTax: list) {
			sb.append(String.format("%s: $ %.2f\n", nameTax.getName(), nameTax.tax()));
		}
		
		return sb.toString();
	}
	
	public static double totalTax(List<TaxPayer> list) {
		double sum = 0.0;
		for(TaxPayer tax: list) {
			sum += tax.tax();
		}
		
		return sum;
	}
}