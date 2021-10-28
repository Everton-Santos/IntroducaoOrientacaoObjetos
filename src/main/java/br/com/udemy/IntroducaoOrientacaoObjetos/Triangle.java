package br.com.udemy.IntroducaoOrientacaoObjetos;

public class Triangle {
	
	public Triangle() {}
	
	double area;
	double p;
	
	public Double AreaTriangulo(double a, double b, double c) {
		p = ((a + b + c) / 2);
		area = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
		return area;
	}
	
	public void CompararArea(double X, double Y) {
		if(Math.max(X, Y) == X) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
	}

	
	
	

}
