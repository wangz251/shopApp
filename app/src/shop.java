import java.util.ArrayList;
import java.util.Scanner;
	
public class shop {
	
	 static ArrayList<Product> prodInf = new ArrayList<>();
	 
	public void addProduct() {
		System.out.println("Which product do you want to add?");
		System.out.println("Name, Kind, Num, Price.");
		Product prod = new Product(getString(), getString(), getInt(), getDouble());
		boolean bool = prodInf.add(prod);
        if (bool == true) {
            System.out.println("Added Successfully!");
        } else {
            System.out.println("Added Failed!");
        }
        System.out.print(prodInf.toString());
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		shop shop = new shop();
		System.out.println("Please choice what you want to do?");
		System.out.println("1. AddProduct");
        switch (sc.nextInt()) {
            case 1:
                shop.addProduct();
                break;
        }
     }
	
	 public static String getString() {
	        Scanner a = new Scanner(System.in);
	        return a.next();
	    }

	    public static int getInt() {
	        Scanner b = new Scanner(System.in);
	        return b.nextInt();
	    }

	    public static double getDouble() {
	        Scanner c = new Scanner(System.in);
	        return c.nextDouble();
	    }
	    
}