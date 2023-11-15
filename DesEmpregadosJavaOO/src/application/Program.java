package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

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
		
		Address address = new Address(departmentEmail, departmentPhone);
		Department depart = new Department(departmentName, payDay, address);
		//ou ...payDay, new Address(departmentEmail,...));
		
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
			depart.addEmployee(employee);//ou <- (new Employee(...));
		}
		
		showReport(depart);
		
		sc.close();
	}
	
	private static void showReport(Department depart) {
		System.out.println(depart);//depart.toString(): opcional
	}
	/*Solução do gabarito para o método stático:
	 * private static void showReport(Department dept) {
	 *  	System.out.println("FOLHA DE PAGAMENTO:");
	 *		System.out.printf("Departamento " + dept.getName() + " = R$ %.2f%n", dept.payroll());
	 *		System.out.println("Pagamento realizado no dia " + dept.getPayDay());
	 *		System.out.println("Funcionários:");
	 *		for (Employee emp : dept.getEmployees()) {
	 *			System.out.println(emp.getName());
	 *		}
	 *		System.out.println("Para dúvidas favor entrar em contato: " + dept.getAddress().getEmail());
	 *}objeto -> atributo
	 *objeto -> subobjeto -> atributo
	 */
	
}
