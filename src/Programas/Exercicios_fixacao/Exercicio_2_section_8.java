package Programas.Exercicios_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_2_section_8 {

	public static void main(String[] args) {
		// Declaration
		Scanner scan = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Exercicio_2_section_8_classe func = new Exercicio_2_section_8_classe();
		double pct;

		// Begin
		System.out.println("Digite o nome do funcion�rio: ");
		func.name = scan.next();
		
		System.out.println("Digite o sal�rio bruto do funcion�rio: ");
		func.gross_salary = scan.nextDouble();
		
		System.out.println("Digite o valor das taxas aplicadas ao sal�rio do funcion�rio: ");
		func.tax = scan.nextDouble();

		System.out.println(func);

		System.out.println("Digite o valor da % de aumento que o funcion�rio ir� receber: ");
		pct = scan.nextDouble();
		
		scan.close();
		
		func.IncreaseSalary(pct);
		
		System.out.println(func);
		// End

	}

}
