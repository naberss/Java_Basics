package Programas;
import java.util.Scanner;

public class teste_switch_case {

	public static void main(String[] args) {
		// TEST_SWITCH_CASE
		// DECLARATION
		int X;
		String dia;
		Scanner scan = new Scanner(System.in);
		// BEGIN
		System.out.println("Digite n�meros correlacionados aos dias da semana: ");
		X = scan.nextInt();
		scan.close();
		switch (X) {
		case 1:
			dia = "Domingo";
			break;

		case 2:
			dia = "Segunda";
			break;

		case 3:
			dia = "Ter�a";
			break;

		case 4:
			dia = "Quarta";
			break;

		case 5:
			dia = "Quinta";
			break;

		case 6:
			dia = "Sexta";
			break;

		default:
			dia = "Valor inv�lido";
			break;
		}
		//teste//
		System.out.println("O n�mero " + X + " corresponde ao dia " + dia);
	}

}
