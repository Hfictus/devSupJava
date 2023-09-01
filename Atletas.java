import java.util.Locale;
import java.util.Scanner;

public class Atletas {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdAtletas, qtdHomens, qtdMulheres;
		String nome, sexo, nomeMaisAlto;
		double altura, peso, somaPesos, pesoMedio, maiorAltura,
		porcentagemHomens, somaAlturasMulheres, alturaMediaMulheres; 
		
		somaPesos = 0.0;
		somaAlturasMulheres = 0.0;
		maiorAltura = 0.0;
		altura = 0.0;
		maiorAltura = 0.0;
		qtdHomens = 0;
		qtdMulheres = 0;
		nomeMaisAlto = "";
		nome = "";
		sexo = "";

		System.out.print("Qual a quantidade de atletas? ");
		qtdAtletas = sc.nextInt();

		for(int i = 1; i <= qtdAtletas; i++) {
		    System.out.println("Digite os dados do atleta número " + i + ":");
		    System.out.print("Nome: ");
		    nome = sc.nextLine();
		    nome = sc.nextLine();
		    System.out.print("Sexo: ");
		    sexo = sc.nextLine();
		    
		    while (!(sexo.equals("f") || sexo.equals("m"))) {
		    	System.out.print("Valor inválido! Favor digitar f ou m: ");
		        sexo = sc.nextLine();
		    }
		    
		    System.out.print("Altura: ");
		    altura = sc.nextDouble();
		    
		    while (altura <= 0.0) {
		    	System.out.print("Valor inválido! Favor digitar um valor positivo: ");
		        altura = sc.nextDouble();
		    }
		    
		    System.out.print("Peso: ");
		    peso = sc.nextDouble();
		    
		    while (peso <= 0) {
		    	System.out.print("Valor inválido! Favor digitar um valor positivo: ");
		        peso = sc.nextDouble();
		    }
		    
		    somaPesos += peso;
		    
		    if (altura > maiorAltura) {
		    	nomeMaisAlto = nome;
		        maiorAltura = altura;
		    }
		    
		    if (sexo.equals("m")) {
		    	qtdHomens++;
		    }
		      
		    if (sexo.equals("f")) {
		    	somaAlturasMulheres += altura;
		        qtdMulheres++;
		    }
		}
		
		pesoMedio = somaPesos / qtdAtletas;
		   
		porcentagemHomens = 100.0 * qtdHomens / qtdAtletas;
		
		System.out.println("\nRELATÓRIO:");
		System.out.printf("Peso médio dos atletas: %.2fKg \n", pesoMedio);
		System.out.printf("Atleta mais alto: %s \n", nomeMaisAlto);
		System.out.printf("Porcentagem de homens: %.1f%%\n", porcentagemHomens);
		
		if (qtdMulheres == 0) {
			System.out.println("Não há mulheres cadastradas");
		}else {
		    alturaMediaMulheres = somaAlturasMulheres / qtdMulheres;
		    	System.out.printf("Altura média das mulheres: %.2f\n"
		    	, alturaMediaMulheres
		    );
		}
		
		sc.close();
	}

}
