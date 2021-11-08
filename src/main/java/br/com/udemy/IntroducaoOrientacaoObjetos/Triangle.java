package br.com.udemy.IntroducaoOrientacaoObjetos;

public class Triangle {
	
	public Triangle() {}
	
	public double a;
	public double b;
	public double c;
	
	private double area;
	private double p;
	
	public Double AreaTriangulo(double a, double b, double c) {
		p = ((a + b + c) / 2);
		area = Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
		return area;
	}
	
	public void CompararArea(double X, double Y) {
		if(X > Y) {
			System.out.println("Large area: X");
		}
		else {
			System.out.println("Large area: Y");
		}
		
	}

	
	
	

}
