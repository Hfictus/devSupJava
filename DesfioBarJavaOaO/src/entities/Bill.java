package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double ticket() {
		if (gender == 'F') {
			return 8.00;
		}
		else {
			return 10.00;
			
		}
	}
	
	public double feeding() {
		return softDrink * 3.00 + beer * 5.00 + barbecue * 7.00;
	}
	
	public double covert() {
		if(feeding() > 30.00) {
			return 0.00;
		}
		else {
			return 4.00;
		}
	}
	
	public double total() {
		return feeding() + covert() + ticket();
	}
	
	System.out.printf("\n"
			+ "RELATÓRIO:\n"
			+ "Couvert: R$ %.2f\n"
			+ "Ingresso: R$ f.2f\n\n"
			+ "Valor a pagar: R$ f.2f\n"
			
		);
	
}
