package entities;

public class Employee {
	
	public Employee(){}
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double netSalary() {
		return grossSalary -= tax;
	}
	
	public void increaseSalay(double percentage) {
		this.grossSalary += ((this.grossSalary + tax) * (percentage / 100));
	}

	@Override
	public String toString() {
		return ": "
				+ name
				+ ", $ "
				+ String.format("%.2f", grossSalary);
	}
	
	

}
