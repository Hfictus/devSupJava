package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String name;
	private Integer payDay;//int -> no gabarito
	
	private Address address;
	
	private List<Employee> employees = new ArrayList<>();
	
	public Department() {
	}
									//int -> no gabarito
	public Department(String name, Integer payDay, Address address) {
		this.name = name;
		this.payDay = payDay;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	     //int -> no gabarito
	public Integer getPayDay() {
		return payDay;
	}
	public void setPayDay(Integer payDay) {
		this.payDay = payDay;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	//no gabarito foi colocado o getEmployees()
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payRoll() {
		double totalPayRoll = 0.0;
		for(Employee emp: employees) {
			totalPayRoll += emp.getSalary();
		}
		return totalPayRoll;
	}
	
	//no gabarito não foi criado um toString() na classe Department
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("\nFOLHA DE PAGAMENTO:\n");
		sb.append("Departamento " + name + " = ");
		sb.append(String.format("R$%.2f\n", payRoll()));
		sb.append("Pagamento realizado no dia " + payDay + "\n");
		sb.append("Funcionários:\n");
		for(Employee emp: employees) {
			sb.append(emp.getName() + "\n");
		}
		sb.append("Para dúvidas, favor entrar em contato: " + address.getEmail());
		return sb.toString(); 
	}
	
}