package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class AppProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			
			Product product = new Product();
			
			System.out.println("Enter product data: ");
			System.out.print("Name: ");
			product.name = sc.next();
			
			System.out.print("Price: ");
			product.price = sc.nextDouble();
			
			System.out.print("Quantity in stock: ");
			product.quantity = sc.nextInt();
			
			System.out.println("\nProduct " + product);
			
			
			System.out.print("\nEnter the number of products to be added in stock: ");
			product.addProducts(sc.nextInt());
			
			System.out.println("\nUpdated " + product);
			
			System.out.print("\nEnter the number of products to be removed from stock: ");
			product.removeProducts(sc.nextInt());
			
			System.out.println("\nUpdate " + product);
			
			System.out.println("\n*** Programa encerrado com sucesso! ***");
				
		} catch (NullPointerException n) {
			System.err.println("Valor nulo");
			n.printStackTrace();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		

	}

}
