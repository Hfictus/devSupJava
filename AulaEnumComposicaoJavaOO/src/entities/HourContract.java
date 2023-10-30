package entities;
//importação relacionada ao tipo Date do atributo date
import java.util.Date;

public class HourContract {
	//atributos:
	private Date date;
	private Double valuePerHour;
	private Integer hours;
	
	//Construtor padrão:
	public HourContract() {
	}
	
	//Construtor com argumentos (sobrecarga):
	public HourContract(Date date, Double valuePerHour, Integer hours) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hours = hours;
	}
	
	//Métodos getters (get) e setters (set):
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
	
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	//multiplica a quantidade de horas pelo preço de cada uma delas:
	public double totalValue() {
		return valuePerHour * hours;//atributos daqui
	}
	
	
	
	
	
	
}
