package br.com.udemy.IntroducaoOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle t = new Triangle();
		double a;
		double b;
		double c;
		
		try {
			
			System.out.println("Enter the measures of triangle X:");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			double X = t.AreaTriangulo(a, b, c);
			System.out.println();
			
			System.out.println("Enter the measures of triangle Y:");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			double Y = t.AreaTriangulo(a, b, c);
			System.out.println();
			
			System.out.printf("Triangle X area: %.4f \n", X);
			System.out.printf("Triangle Y area: %.4f \n", Y);
			
			t.CompararArea(X, Y);
			
			
		} catch (NullPointerException n) {
			System.err.println("Variável não pode ser 'Null'");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
		
		
		
	}
}
