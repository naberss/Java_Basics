package Programas;
import java.util.Locale;
import java.util.Scanner;

import classes.Triangulo;

public class Area_triangulo {

	public static void main(String[] args) {
		// Declaration
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		// Begin
		System.out.println("Digite as medidas do tri�ngulo X: ");
		x.a = scan.nextDouble();
		x.b = scan.nextDouble();
		x.c = scan.nextDouble();
		System.out.println("Digite as medidas do tri�ngulo Y: ");
		y.a = scan.nextDouble();
		y.b = scan.nextDouble();
		y.c = scan.nextDouble();
		scan.close();
		System.out.printf("A �rea do tri�ngulo X � de %.4f%n", x.area());
		System.out.printf("A �rea do tri�ngulo y � de %.4f%n", y.area());
		// End
		
		

	}

}
