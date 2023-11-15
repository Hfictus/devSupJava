package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
	
	public static void main(String[] args) {
		
		//construtor -> Account(number, holder, interestRate)
		Account acc = new Account(1000, "Alex", 0.0);
		
		//construtor -> (number, holder, balance, loanLimit) 
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		SavingsAccount savacc = new SavingsAccount(1005, "Peter", 0.0, 0.0);
		
		//Exemplos de upcasting
		//bacc -> acc1: bacc(subclasse) atribuído a acc1(superclasse):
		Account acc1 = bacc;
		
		//			  construtor(number, holder, balance, loanLimit);
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		
		//construtor(number, holder, balance, interestRate);
		Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);
		
		//Exemplos de downcasting:
		//subclasse	<- objeto <- casting  <-    objeto da superclasse Account
		BusinessAccount acc4 = (BusinessAccount)acc2;
		
		
		//instanceof -> se acc3 for instância de BusinessAccount então:
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Empréstimo");
		}
		
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update");
		}
		
		
		
	}
	
	
}