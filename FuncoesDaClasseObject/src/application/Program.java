//métodos do objeto Object:
package application;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Date d, f;
		f = new Date();
		d = new Date();
		
		//equals(): compara objetos (se são iguais ou não):
		System.out.println(sc.equals(d));
		System.out.println(d.equals(f));
		//getClass(): diz qual é o tipo do objeto (no caso, de sc):
		System.out.println(sc.getClass());
		//hashCode(): retorna o código hash do objeto, ou compara objetos:
		System.out.println(sc.hashCode());
		System.out.println(sc.hashCode() == d.hashCode());
		
		sc.close();
	}
	
}