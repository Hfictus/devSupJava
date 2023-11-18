package entities;

public class Employee {
	//atributos da superclasse
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	
	//construtor padrão (sem super):
	public Employee() {
	}
	
	//construtor com sobrecarga:
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	
	//métodos getters e setters:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	//função para devolver o pagamento:
	public double payment() {
		return hours * valuePerHour;
	}
}
