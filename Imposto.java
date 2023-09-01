package application;
import java.util.Locale;
import java.util.Scanner;

public class Imposto {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double rendaSalario, rendaMensal, rendaServico,
		rendaGanhoCapital, gastosMedicos, gastosEducacionais,
		impostoSalario, impostoServico, impostoGanhoCapital,
		gastosDedutiveis, maximoDedutivel, abatimento,
		totalBruto, totalLiquido;
		
		System.out.print("Renda anual com salário: ");
		rendaSalario = sc.nextDouble();
		System.out.print("Renda anual com prestação de serviço: ");
		rendaServico = sc.nextDouble();
		System.out.print("Renda anual com ganho de capital: ");
		rendaGanhoCapital = sc.nextDouble();
		System.out.print("Gastos médicos: ");
		gastosMedicos = sc.nextDouble();
		System.out.print("Gastos educacionais: ");
		gastosEducacionais = sc.nextDouble();
		
		rendaMensal = rendaSalario / 12.0;
		
		if(rendaMensal < 3000.0) {
			impostoSalario = 0.0;
		}else if(rendaMensal < 5000.0) {
			impostoSalario = rendaSalario * 0.1;
		}else {
			impostoSalario = rendaSalario * 0.2;
		}
		
		impostoServico = rendaServico * 0.15;
		   
		impostoGanhoCapital = rendaGanhoCapital * 0.2;
		   
		totalBruto = impostoSalario + impostoServico + impostoGanhoCapital;
		   
		gastosDedutiveis = gastosMedicos + gastosEducacionais;
		   
		maximoDedutivel = totalBruto * 0.3;
		   
		abatimento = (gastosDedutiveis > maximoDedutivel)?
		maximoDedutivel:gastosDedutiveis;
		   
		totalLiquido = totalBruto - abatimento;
		
		System.out.printf(
		"\n" + "RELATÓRIO DE IMPOSTO DE RENDA \n \n"
		+ "CONSOLIDADO DE RENDA: \n"
		+ "Imposto sobre salário: %.2f \n"
		+ "Imposto sobre serviços: %.2f \n"
		+ "Imposto sobre ganho de capital: %.2f \n\n"
		+ "DEDUÇÕES: \n"
		+ "Máximo dedutível: %.2f \n"
		+ "Gastos dedutíveis: %.2f \n\n"
		+ "RESUMO: \n"
		+ "Imposto bruto total: %.2f \n"
		+ "Abatimento: %.2f \n"
		+ "Imposto devido: %.2f \n"
		, impostoSalario, impostoServico, impostoGanhoCapital,
		maximoDedutivel, gastosDedutiveis, totalBruto,
		abatimento, totalLiquido
		);
		
		
		sc.close();
	}

}

