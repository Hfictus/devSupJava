package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		//list é uma lista de tipo genérico (public abstract class Account)
		List<Account> list = new ArrayList<>();
		
		//instanciando objetos (contas) de tipos diferentes e inserindo na lista genérica:
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Anna", 500.0, 500.0));
		
		//totalizar saldo das contas (independentemente do tipo delas):
		double sum = 0.0;
		for(Account acc: list) {
			sum += acc.getBalance();
		}
		System.out.printf("Total balance: %.2f\n\n", sum);
		
		//depósito de valor em cada conta da lista
		for(Account acc: list) {
			acc.deposit(10.0);
		}
		
		//mostrando o saldo atualizado das contas:
		for(Account acc: list) {
			System.out.println(
				"Conta " +
				acc.getNumber() +
				": " + acc.getBalance()
			);
		}
		
	}
}