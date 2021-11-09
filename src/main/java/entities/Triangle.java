package entities;

public class Triangle {
	
	public Triangle() {}
	
	public double a;
	public double b;
	public double c;
	
	private double p;
	
	public Double AreaTriangulo() {
		p = ((a + b + c) / 2);
		return Math.sqrt(p * ((p - a) * (p - b) * (p - c)));
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
