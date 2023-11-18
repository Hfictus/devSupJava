package entities;

public class OutsourcedEmployee extends Employee {
	//atributo adicional da subclasse
	private Double additionalCharge;
	
	//construtor padrão (com super):
	public OutsourcedEmployee() {
		super();
	}
	
	//construtor com argumentos ou parâmetros (sobrecarga) e super():
	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);//argumentos repassados para a superclasse
		this.additionalCharge = additionalCharge;
	}
	
	//métodos getters e setters:
	public Double getAdditionalCharge() {
		return additionalCharge;
	}
	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	//método de pagamento para empregados terceirizados:
	@Override
	public double payment() {
		return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	
	
	
}
