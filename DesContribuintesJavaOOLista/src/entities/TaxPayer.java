package entities;

public class TaxPayer {

	private Double salaryIncome;
	private Double servicesIncome;
	private Double capitalIncome;
	private Double healthSpending;
	private Double educatioinSpending;
	
	public TaxPayer() {
		
	}
	public TaxPayer(Double salaryIncome, Double servicesIncome, Double capitalIncome, Double healthSpending, Double educatioinSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educatioinSpending = educatioinSpending;
	}
	
	public Double getSalaryIncome() {
		return salaryIncome;
	}
	public void setSalaryIncome(Double salaryIncome) {
		this.salaryIncome = salaryIncome;
	}
	
	public Double getServicesIncome() {
		return servicesIncome;
	}
	public void setServicesIncome(Double servicesIncome) {
		this.servicesIncome = servicesIncome;
	}
	
	public Double getCapitalIncome() {
		return capitalIncome;
	}
	public void setCapitalIncome(Double capitalIncome) {
		this.capitalIncome = capitalIncome;
	}
	
	public Double getHealthSpending() {
		return healthSpending;
	}
	public void setHealthSpending(Double healthSpending) {
		this.healthSpending = healthSpending;
	}
	
	public Double getEducatioinSpending() {
		return educatioinSpending;
	}
	public void setEducatioinSpending(Double educatioinSpending) {
		this.educatioinSpending = educatioinSpending;
	}
	
	
	public double salaryTax(double a) {
		return 0;
	}
	public double servicesTax(double b) {
		return 0;
	}
	public double capitalTax(double c) {
		return 0;
	}
	public double grossTax(double d) {
		return 0;
	}
	public double taxRebate(double e) {
		return 0;
	}
	public double netTax(double f) {
		return 0;
	}
	
	
	
}
