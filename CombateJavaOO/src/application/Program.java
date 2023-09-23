package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Champion;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Champion champion1 = null, champion2 = null;
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
				champion1 = new Champion(name, life, attack, armor);
				firstOrSec = "segundo";
				sc.nextLine();
				break;
			case 1:
				champion2 = new Champion(name, life, attack, armor);
				break;
			}
		}
		
		System.out.print("Quantos turnos você deseja executar? ");
		int rounds = sc.nextInt();
		
		int i = 0;
		while (i < rounds && champion1.getLife() != 0 && champion2.getLife() != 0) {
			champion1.takeDamage(champion2);
			champion2.takeDamage(champion1);
			System.out.println("\nResultado do turno " + (i+1) + ":");
			System.out.print(champion1.status());
			System.out.print(champion2.status());
			i++;
		}
		
		System.out.println("\nFIM DO COMBATE\n");
		
		sc.close();
	}

}
