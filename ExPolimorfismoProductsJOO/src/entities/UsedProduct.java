package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
	
	
	/*private final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	 * ou private static final...
	 */
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			
	private Date manufactureDate;
	
	
	public UsedProduct() {
		super();
	}
	
	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	/*public SimpleDateFormat getSdf() {
	 *	return sdf;
	 *}
	 */
	
	@Override
	public String priceTag() {
		return String.format(
					"%s (used) $ %.2f (Manufacture date: %s)"
				   , getName()
				   , getPrice()
				   , sdf.format(manufactureDate)
		       );
	}
	
	
	
	
}
