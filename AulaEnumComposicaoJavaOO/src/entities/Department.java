package entities;

public class Department {
	//atributo 
	private String name;
	
	
	//Construtor padrão:
	public Department() {
	}
	
	//Construtor com argumento (sobrecarga):
	public Department(String name) {
		this.name = name;
	}
	
	//métodos get e set:
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
