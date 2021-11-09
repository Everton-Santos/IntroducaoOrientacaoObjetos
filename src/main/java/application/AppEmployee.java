package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class AppEmployee {

	public static void main(String[] args) {
		
		try {
			
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Employee employee = new Employee();

			System.out.print("Name: ");
			employee.name = sc.nextLine();
			
			System.out.print("Gross salary: ");
			employee.grossSalary = sc.nextDouble();
			
			System.out.print("Tax: ");
			employee.tax = sc.nextDouble();
			employee.netSalary();
			
			System.out.println("\nEmployee" + employee);
			
			System.out.print("\nWhich percentage to increase salary? ");
			employee.increaseSalay(sc.nextDouble());
			
			System.out.println("\nUpdated data" + employee);
			
		
		} catch (NullPointerException n) {
			System.err.println("Campo nulo");
			n.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}

		
	}

}
