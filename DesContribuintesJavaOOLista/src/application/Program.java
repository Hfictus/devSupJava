package application;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("\nDigite os dados do %dº contribuinte:\n",i+1);
			System.out.print("Renda anual coom salário: ");
			Double salary = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviços: ");
			Double services = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			Double capital = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			Double health = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			Double education = sc.nextDouble();
			
			TaxPayer tPayer = new TaxPayer(salary, services, capital, health, education);
			list.add(tPayer);
			//list.add(new TaxPayer(salary, services, capital, health, education));
		}
		
		//salary tax
		
		
		/*for(int i = 0; i < n; i++) {
			System.out.printf("\nResumo do %dº contribuinte:\n",i+1);
			System.out.println(list.get(i));
		}*/
		int i = 0;
		for(TaxPayer obj : list) {
			System.out.printf("\nResumo do %dº contribuinte:\n",++i);
			System.out.println(obj);
		}
		
		sc.close();
	}

}
