package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Bill;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bill bill = new Bill();
		
		//Leitura dos dados:
		System.out.print("Sexo: ");
		bill.gender = sc.next().charAt(0);
		System.out.print("Quantidade de cervejas: ");
		bill.beer = sc.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		bill.softDrink = sc.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		bill.barbecue = sc.nextInt();
				
		//Saída:
		
		System.out.print(bill.toString(bill.cover()));
				
		sc.close();
	}

}
