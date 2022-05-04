package exam.Program;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exam.Model.Produkt;
import exam.Utility.Input;

public class Start {

	private List<Produkt> products;
	private List<Produkt> productsB;

	private Scanner scstart;
	private Produkt produkt;
	private BigDecimal itemCost = BigDecimal.ZERO;
	private BigDecimal totalCost = BigDecimal.ZERO;

	public Start() {
		products = new ArrayList<>();
		productsB = new ArrayList<>();
		scstart = new Scanner(System.in);
		program();
		scstart.close();

	}

	private void program() {
		title();
		mainWindow();

	}

	private void title() {

		System.out.println("*****************************");
		System.out.println("******* Program Shop ********");
		System.out.println("*****************************");

	}

	private void mainWindow() {
		System.out.println("\n1. Add product");
		System.out.println("\n2. Add product to shopping cart");
		System.out.println("\n3. Remove product from shopping cart");
		System.out.println("\n4. Checkout");
		System.out.println("\n5. Exit the program!");
		switch (Input.inputInt(scstart, "Choose your operation please!")) {
		case 1:
			addProduct();
			break;
		case 2:
			addToShoppingCart();
			break;
		case 3:
			removeFromShoppingCart();
			break;
		case 4:
			checkout();
			break;
		case 5:
			System.out.println("Thank you for using my program, Good bye!");
			break;
		default:
			System.out.println("Please choose valid operation!");

		}

	}

	

	private void addProduct() {
		produkt = new Produkt();
		produkt.setId(Input.inputLong(scstart, "Please choose ID for the product (1-9) !"));
		produkt.setName(Input.inputString(scstart, "Please choose a name of the product!"));
		produkt.setQuantity(Input.inputInt(scstart, "Please choose the quantity of the product!"));
		produkt.setPrice(Input.inputBigDecimal(scstart, "Please set the price for your product!"));
		produkt.setCartQuantity(0);
		products.add(produkt);
		productsB.add(produkt);
		mainWindow();

	}

	private void addToShoppingCart() {
		int i = Input.inputInt(scstart, "Which product would you like to add to your cart?");
		// Produkt p;
		produkt = productsB.get(i - 1);
		produkt.setCartQuantity(Input.inputInt(scstart, "Choose desired amount to add to cart!"));

		
		for (int j = 0; j < produkt.getCartQuantity() - 1; j++) {

			//products.add(produkt);
			productsB.add(produkt);
		}
		mainWindow();
	}

	private void removeFromShoppingCart() {
		products.remove(Input.inputInt(scstart, "Please type in the ID of the product you want to remove!") - 1);
		mainWindow();
	}

	private void checkout() {
		int j = 0;
		for (Produkt p : productsB) {
			System.out.println(j++ + ". " + p);
		}
		System.out.println("Total price is: " + getTotalPrice());
		for(int i = 0; i<= produkt.getCartQuantity()-1;i++) {
		productsB.remove(produkt);
		}
		mainWindow();
	}

	public BigDecimal getTotalPrice() {
		BigDecimal sum = BigDecimal.ZERO;
		BigDecimal sum2 = BigDecimal.ZERO;

		BigDecimal totalCost = BigDecimal.ZERO;
		for (Produkt p : productsB) {
			sum = sum.add(p.getPrice());

		}
		return sum;
	}

	public static void main(String[] args) {
		new Start();
	}

}
