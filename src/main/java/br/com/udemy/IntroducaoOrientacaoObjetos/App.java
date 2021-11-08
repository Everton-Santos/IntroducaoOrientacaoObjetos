package br.com.udemy.IntroducaoOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle t1, t2, t;
		t1 = new Triangle();
		t2 = new Triangle();
		t = new Triangle();
		
		try {
			
			System.out.println("Enter the measures of triangle X:");
			t1.a = sc.nextDouble();
			t1.b = sc.nextDouble();
			t1.c = sc.nextDouble();
			double X = t1.AreaTriangulo(t1.a, t1.b, t1.c);
			System.out.println();
			
			System.out.println("Enter the measures of triangle Y:");
			t2.a = sc.nextDouble();
			t2.b = sc.nextDouble();
			t2.c = sc.nextDouble();
			double Y = t2.AreaTriangulo(t2.a, t2.b, t2.c);
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
