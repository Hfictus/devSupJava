package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {
	//exceção: throws ParseException
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		//Nome do departamento:
		System.out.print("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		//Dados do trabalhador:
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = sc.nextLine();
		System.out.print("Level: ");
		String workerLevel = sc.nextLine();
		System.out.print("Base salary: ");
		double baseSalary = sc.nextDouble();
		
		//instanciação do trabalhador e associação entre Worker e Department
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		//Definição de quantos contratos a serem lidos:
		System.out.print("How many contracts to this worker? ");
		int n = sc.nextInt();
		
		//Leitura dos dados de cada contrato, instanciação:
		for(int i = 1; i <= n; i++) {
			System.out.println("Enter contract #" + i + " data:");
			System.out.print("Data (dd/mm/yyyy): ");
			Date contractDate = sdf.parse(sc.next());//exceção -> ver acima
			System.out.print("Value per hour: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = sc.nextInt();
			//instanciação do objeto contrat (do contrato):
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			//associação do contrato com o trabalhador (HourContract - Worker)
			Worker.addContract(contract);
		}
		
		//Leitura de mês e ano:
		System.out.print("\nEnter month and year to calculate income (mm/yyyy): ");
		String monthAndYear = sc.next();
		//  atribuição <- conversão <-      recorte
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		//Resultados:
		System.out.println("Name: " + Worker.getName());
		System.out.println("Department: " + Worker.getDepartment().getName());
		System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f\n", Worker.income(year, month)));
		sc.close();
	}
}