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
	
	public double getSalaryIncome() {
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
	
	
	public double salaryTax() {
		double gTax;
		double salary = salaryIncome / 12.0;
		if(salary < 3000.0) {
			gTax = 0.0;
		}
		else if (salary < 5000.0) {
			gTax = salaryIncome * 0.10;
		}
		else {
			gTax = salaryIncome * 0.20;
		}
		
		return gTax;
	}
	public double servicesTax() {
		return servicesIncome * 0.15;
	}
	public double capitalTax() {
		return capitalIncome * 0.20;
	}
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	public double taxRebate() {
		double groosTaxRebate = grossTax() * 0.30;
		double spendings = healthSpending + educatioinSpending; 
		double rebate;
		if(groosTaxRebate > spendings) {
			rebate = spendings;
		}
		else {
			rebate = groosTaxRebate;
		}
		return rebate;
	}
	public double netTax() {
		return grossTax() - taxRebate();
	}
	
	public String toString() {
		return String.format(
				  "Imposto bruto total: %.2f\n"
				+ "Abatimento: %.2f\n"
				+ "Imposto devido: %.2f"
				, grossTax(), taxRebate()
				, netTax()
				  
			   );
	}
	
}
