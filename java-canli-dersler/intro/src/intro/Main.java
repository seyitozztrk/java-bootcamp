package intro;

public class Main {
	
	//classes are reference types.

	public static void main(String[] args) {
		//Product product1 = new Product(1, "Lenovo V14", 15000, "32gb RAM");
	
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenova V15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		
		System.out.println(product2.getUnitPriceAfterDiscount());
		
		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Yiyecek");
		
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ýcecek");
		
		System.out.println(category1.getName());
		System.out.println(category2.getName());
		
		
		//Product product3 = new Product(3, "Lenovo V16", 17000, "128gb RAM");
		/*product3.id = 3;
		product3.name = "Lenovo V16";
		product3.unitPrice = 17000;
		product3.detail = "128gb RAM";*/
		/*
		Product[] products = {product1, product2, product3};
		
		for (Product product: products) {
			System.out.println(product.name);
			System.out.println(product.unitPrice);
			System.out.println("******");
		}
		
		System.out.println(products.length);
		
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Bilgisayar";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Ev/Bahçe";
		
		System.out.println("<<<<<--------continue with PRODUCTMANAGER->>>>>>>>>>>");
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product3);

		
		*/
		
		
		
		
	}

}
