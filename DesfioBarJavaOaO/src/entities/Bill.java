package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
			
		}
	}
	
	public double feeding() {
		return softDrink * 3.0 + beer * 5.0 + barbecue * 7.0;
	}
	
	public double cover() {
		if(feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}
	
	public String toString(double couvert) {
		if (couvert > 0.0) {
			return  String.format(
						"\n"
						+ "RELATÓRIO:\n"
						+ "Consumo = R$ %.2f\n"
						+ "Couvert = R$ %.2f\n"
						+ "Ingresso = R$ %.2f\n\n"
						+ "Valor a pagar = R$ %.2f\n"
						,feeding(), cover()
						, ticket(), total()
					);
		}
		else {
			return String.format(
						"\n"
						+ "RELATÓRIO:\n"
						+ "Consumo = R$ %.2f\nIsento de couvert \n"
						+ "Ingresso = R$ %.2f\n\n"
						+ "Valor a pagar = R$ %.2f\n"
						, feeding(), ticket(), total()
					);
		}
				
	}
	
}
