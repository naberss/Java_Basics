package Programas;
import java.util.Scanner;

public class multiplos {

	public static void main(String[] args) {
		// O programa ir� pedir 2 n�meros e ir� validar
		// se os mesmos s�o m�ltiplos.
		// DECLARATION
		Scanner scan = new Scanner(System.in);
		int a, b;

		// BEGIN
		System.out.println("Digite o valor do primeiro numero: ");
		a = scan.nextInt();
		System.out.println("Digite o valor do segundo numero: ");
		b = scan.nextInt();
		scan.close();
		if (a == 0 || b == 0) {
			System.out.println("Nenhum n�mero � m�ltiplo de 0");
		} else {

			// SECOND IF STATEMENT BEGIN
			if (a >= b) {
				// THIRD IF STATEMENT BEGIN
				if (a % b == 0) {
					System.out.println(a + " e " + b + " s�o m�ltiplos");
				} else {
					System.out.println(a + " e " + b + " n�o s�o m�ltiplos");
				}
				// THIRD IF STATEMENT END

			} else {
				// THIRD IF STATEMENT BEGIN
				if (b % a == 0) {
					System.out.println(b + " e " + a + " s�o m�ltiplos");
				} else {
					System.out.println(b + " e " + a + " n�o s�o m�ltiplos");
				}
				// THIRD IF STATEMENT END

			}
			// SECOND IF STATEMENT END
		}
		// END
	}

}
