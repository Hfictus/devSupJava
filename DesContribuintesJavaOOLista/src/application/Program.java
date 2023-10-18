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
			Double salary = sc.nextDouble();//ou double
			System.out.print("Renda anual com prestação de serviços: ");
			Double services = sc.nextDouble();//ou double
			System.out.print("Renda anual com ganho de capital: ");
			Double capital = sc.nextDouble();//ou double
			System.out.print("Gastos médicos: ");
			Double health = sc.nextDouble();//ou double
			System.out.print("Gastos educacionais: ");
			Double education = sc.nextDouble();//ou double
			
			TaxPayer tPayer = new TaxPayer(salary, services, capital, health, education);
			list.add(tPayer);
			//list.add(new TaxPayer(salary, services, capital, health, education));
		}
		
		
		//...?
		
		/*
		 * Duas formas de saída com uso de 
		 * toString() na classe TaxPayer:
		 * primeira forma:
		 * for(int i = 0; i < n; i++) {
			System.out.printf("\nResumo do %dº contribuinte:\n",i+1);
			System.out.println(list.get(i));
		}
		ou, segunda forma:
		*/
		int i = 0;
		for(TaxPayer obj : list) {
			System.out.printf("\nResumo do %dº contribuinte:\n",++i);
			System.out.println(obj);
		}
		
		/*Forma de saída quando não há toString()
		 * na classe TaxPayer (do gabarito):
		 * Obs.: Essa saída é mais adequada porque permite
		 * que a classe seja reutilizada.
		 * for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
			System.out.printf("Imposto bruto total: %.2f%n", list.get(i).grossTax());
			System.out.printf("Abatimento: %.2f%n", list.get(i).taxRebate());
			System.out.printf("Imposto devido: %.2f%n", list.get(i).netTax());
		}
		O toString() permite formatar a saída.
		 */
		
		sc.close();
	}

}
