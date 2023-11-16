package entities;

/*Para o caso de não se querer a criação de uma subclasse para SavingsAccount:
 * public final class SavingsAccount extends Account {...
 */

public class SavingsAccount extends Account {
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}
	
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}
	
	public Double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override
	public void withDraw(double amount) {
		balance -= amount;
	}
	
	/*sintaxe para o caso de não se querer que um método seja sobrescrito:
	 * @Override
	 * public final void withDraw(double amount) {
	 *   balance -= amount;
	 * }
	 * Usa-se: final (o método não pode ser sobrescrito em outras classes).
	 */
	
	
}
