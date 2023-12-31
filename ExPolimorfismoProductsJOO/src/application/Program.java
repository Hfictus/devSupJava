//ver como criar método stático para verificar o char
package application;

import java.util.ArrayList;
import java.util.List;
import java.text.ParseException;
//import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.ImportedProduct;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			String name = "";
			double price = 0.0;
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char statusProduct = sc.next().charAt(0);
			if(addNameAndPrice(statusProduct)) {
				System.out.print("Name: ");
				sc.nextLine();
				name = sc.nextLine();
				System.out.print("Price: ");
				price = sc.nextDouble();
			}
			switch (statusProduct) {
			case 'c':
				list.add(new Product(name, price));
				break;
			case 'u':
				//Usando a classe UsedProduct para acessar sdf
				System.out.print("Manufature date (DD/MM/YYYY): ");
				Date dateProduct = UsedProduct.sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, dateProduct));
				/*
				 * declarando um objeto do tipo UsedProduct para acessar sdf:
				 *System.out.print("Manufature date (DD/MM/YYYY): ");
				 *UsedProduct usedP = new UsedProduct();
				 *Date dateProduct = usedP.getSdf().parse(sc.next());
				 *list.add(new UsedProduct(name, price, dateProduct));
				 */
				break;
			case 'i':
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
				break;
			default:
				i--;
				System.out.println(statusProduct + " is an invalid option.");
				break;
			}
			
		}
		
		System.out.println();
		for(Product product: list) {
			System.out.println(product.priceTag());
		}
		
		
		sc.close();
	}
	//char x = statusProduct:
	public static boolean addNameAndPrice(char x) {
		return x == 'c' || x == 'u' || x == 'i';
	}

}