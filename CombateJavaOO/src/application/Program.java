package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion a = null, b = null;
		String firstOrSec = "primeiro";
		
		for(int i = 0; i < 2; i++) {
			System.out.println("Digite os dados do " + firstOrSec + " campeão:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Vida: ");
			int life = sc.nextInt();
			System.out.print("Ataque: ");
			int attack = sc.nextInt();
			System.out.print("Armadura: ");
			int armor = sc.nextInt();
			System.out.println();
			switch(i) {
			case 0:
				a = new Champion(name, life, attack, armor);
				firstOrSec = "segundo";
				sc.nextLine();
				break;
			case 1:
				b = new Champion(name, life, attack, armor);
				break;
			}
		}
		
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
		for(int i = 0; i < rounds; i++) {
			
			System.out.print(a);
			System.out.print(b);
			
		}
		
		sc.close();
	}

}
