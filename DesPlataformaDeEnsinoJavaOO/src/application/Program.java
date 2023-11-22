package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Lesson;

public class Program {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Lesson> list = new ArrayList<>();
		
		System.out.print("Quantas aulas tem o curso? ");
		int classes = sc.nextInt();
		
		for(int i = 1; i <= classes; i++) {
			System.out.println("Dados da " + i + "ª aula:");
			System.out.print("Conteúdo ou tarefa (c/t)? ");
			char classType = sc.next().charAt(0);
			if(classType == 'c' || classType == 't') {
				System.out.print("Título: ");
				sc.nextLine();
				String title = sc.nextLine();
				switch (classType) {
				case 'c':
					System.out.print("URL do vídeo: ");
					String url = sc.nextLine();
					System.out.print("Duração em segundos: ");
					int seconds = sc.nextInt();
					list.add(new Video(title, url, seconds));
					break;
				case 't':
					System.out.print("Descrição: ");
					String description = sc.nextLine();
					System.out.print("Quantidade de questões: ");
					int questionCount = sc.nextInt();
					list.add(new Task(title, description, questionCount));
					break;
				}
			}
			else {
				i--;
				System.out.println("Opção inválida, tente novamente.");
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}
}