package Programas;
import java.util.Scanner;

public class Eixos {

	public static void main(String[] args) {
		// O programa ir� receber 2 cordenadas de um
		// plano cartesiano e ter� que validar em qual quadrante
		// o ponteiro est�.
		// DECLARATION
		double X, Y;
		Scanner scan = new Scanner(System.in);
		// BEGIN
		System.out.println("Digite a posi��o de eixo X no qual se encontra o ponteiro: ");
		X = scan.nextDouble();
		System.out.println("Digite a posi��o de eixo Y no qual se encontra o ponteiro: ");
		Y = scan.nextDouble();  
		scan.close();
		// MAIN IF BEGIN
		if (X == 0 && Y == 0) {
			System.out.println("O ponteiro est� na origem");
		} else
		// OVER THE AXIS LINE (BEGIN)
		if (X == 0 || Y == 0) {
			if (X == 0) {
				System.out.println("Sobre o eixo X");
			} else {
				System.out.println("Sobre o eixo Y");
			}

		}
		// OVER THE AXIS LINE (END)
		else
		// VALIDATING POINTING LOCATION (BEGIN)
		if (Y > 0 && X > 0) {
			System.out.println("O ponteiro est� no quadrante Q1");

		} else if (Y < 0 && X > 0) {
			System.out.println("O ponteiro est� no quadrante Q2");

		} else if (Y < 0 && X < 0) {
			System.out.println("O ponteiro est� no quadrante Q3");
		} else {
			System.out.println("O ponteiro est� no quadrante Q4");
		}
		// VALIDATING POINTING LOCATION (END)
		// END
	}

}
