package homework3;

public class Main {
	public static void main(String[] args) {
		Product product = new Product(1,"laptop", "asus", 1400, 4,"Kýrmýzý");
		/*
		product.setName("Laptop"); 
		product.setDescription("Asus Laptop");
		product.setPrice(4000);
		product.setStockAmount(3);
		*/
		System.out.println(product.getName());
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
