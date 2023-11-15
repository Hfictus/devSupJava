package entities;

public class Employee {
	private String name;
	private Double salary;//double -> no gabarito
	
	public Employee() {
	}
								//double -> no gabarito
	public Employee(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	     //double -> no gabarito
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
}
