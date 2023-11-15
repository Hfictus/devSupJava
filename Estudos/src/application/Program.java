package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		List<String> listaD;
		lista.add("Ana");
		lista.add("Beatriz");
		lista.add("Carla");
		lista.add("Daniela");
		lista.add("Fernanda");
		lista.add("Débora");
		lista.add("Mariana");
		lista.add("Denise");
		
		listaD = lista.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		
		for(String l1: lista) {
			System.out.println(l1);
		}
		System.out.println();
		for(String l2: listaD) {
			System.out.println(l2);
		}
		
	}
	
}