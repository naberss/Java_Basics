package Programas;
import java.util.Scanner;

public class Plano_cartesiano_while_loop {

	public static void main(String[] args) {
		// DECLARATION
		Integer X, Y;
		Scanner scan = new Scanner(System.in);
		// BEGIN
		System.out.println("Digite o valor da vari�vel X: ");
		X = scan.nextInt();
		System.out.println("Digite o valor da vari�vel Y: ");
		Y = scan.nextInt();
		// BEGIN WHILE STATEMENT
		while (X != 0 && Y != 0) {

			// BEGIN 1� IF (1� QUAD.)
			if (X > 0 && Y > 0) {
				System.out.println("As vari�veis apontam para o 1� quadrante");
			}
			// END 1� IF

			else
			// BEGIN 2� IF (2� QUAD.)
			if (X < 0 && Y > 0) {
				System.out.println("As vari�veis apontam para o 2� quadrante");
			}
			// END 2� IF

			else
			// BEGIN 3� IF (3� QUAD.)
			if (X < 0 && Y < 0) {
				System.out.println("As vari�veis apontam para o 3� quadrante");
			}
			// END 3� IF

			else
			// BEGIN 4� IF (4� QUAD.)
			if (X > 0 && Y < 0) {
				System.out.println("As vari�veis apontam para o 4� quadrante");
			}
			// END 4� IF

			else
			// BEGIN 5� IF (SOBRE A LINHA)
			if (X == 0 || Y == 0) {
				System.out
						.println("A localiza��o vigente est� sobre o tra�ado,\nn�o se enquadrando em nenhum quadrante");
			}
			// END 5� IF

			// BEGIN VARIABLES INSERTION SO THEY CAN LOOP WITH NEW VALUES
			System.out.println("\nDigite o valor da vari�vel X: ");
			X = scan.nextInt();
			System.out.println("\nDigite o valor da vari�vel Y: ");
			Y = scan.nextInt();
			// BEGIN VARIABLES INSERTION SO THEY CAN LOOP WITH NEW VALUES

		}
		scan.close();
		// END WHILE STATEMENT
		// END
	}

}
