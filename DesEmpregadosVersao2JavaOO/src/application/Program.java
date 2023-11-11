package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Department;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome do departamento: ");
		String departmentName = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payDay = sc.nextInt();
		System.out.print("Email: ");
		sc.nextLine();
		String departmentEmail = sc.nextLine();
		System.out.print("Telefone: ");
		String departmentPhone = sc.nextLine();
		
		//Address address = new Address(departmentEmail, departmentPhone);
		Department depart = new Department(
				departmentName, payDay, 
				depart.setAddress(departmentEmail, departmentPhone)
		
		);
		
		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Dados do funcionário " + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String employeeName = sc.nextLine();
			System.out.print("Salário: ");
			double employeeSalary = sc.nextDouble();
			Employee employee = new Employee(employeeName, employeeSalary);
			depart.addEmployee(employee);
		}
		
		showReport(depart);
		
		sc.close();
	}
	
	private static void showReport(Department depart) {
		System.out.println(depart.toString());
	}
}
