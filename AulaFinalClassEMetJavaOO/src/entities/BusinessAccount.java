package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}
	
	
	public Double getLoanLimit() {
		return loanLimit;
	}
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10.0;//balance como protected
		}
	}
	
	@Override
	public void withDraw(double amount) {
		super.withDraw(amount);
		balance -= 2.0;
	}
	
	
	/*para ser usado quando balance (Account) for private
	 * public void loan(double amount) {
	 *	if(amount <= loanLimit) {
	 *		deposit(amount);
	 *	}
	 *}
	 */
	
	
	
	
	
}
