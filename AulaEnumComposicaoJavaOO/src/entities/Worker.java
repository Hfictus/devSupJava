package entities;

import java.util.Calendar;
import java.util.ArrayList;
import java.util.List;
import entities.enums.WorkerLevel;

public class Worker {
	//atributos básicos (dados):
	private static String name;
	private WorkerLevel level;
	private static Double baseSalary;
//atributos de associação entre classes
	private static Department department;
	private static List<HourContract> contracts = new ArrayList<>();
	
	//Construtor padrão:
	public Worker() {
	}
	
	//Construtor com argumentos (sobrecarga):
	public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	
	//Criação de getters (get) e setters (set) para os atributos:
	public static String getName() {
		return name;
	}
	public static void setName(String name2) {
		name = name2;
	}
	
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	
	public static Double getBaseSalary() {
		return baseSalary;
	}
	public static void setBaseSalary(Double baseSal) {
		baseSalary = baseSal;
	}
	
	public static Department getDepartment() {
		return department;
	}
	public void setDepartment(Department depart) {
		department = depart;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}
	/*não pode haver setContracts(List<HourContract> contracts) {}
	 * porque troca a lista.
	 */	
	
	//método de adição de contrato:
	public static void addContract(HourContract contract) {
		contracts.add(contract);
	}
	
	//método de remoção de contrato:
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	//método que calcula quanto o trabalhador ganhou:
	public static double income(int year, int month) {
		double sum = baseSalary;//sum é variável local
		Calendar cal = Calendar.getInstance();
		for(HourContract c: contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1 + cal.get(Calendar.MONTH);
			if(year == c_year && month == c_month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
	
	
	
}
