package homework_1;

public class Main {

	static int topla(int... sayilar) { //variable arguments
		int toplam=0;
		
		for (int sayi:sayilar) {
			toplam+=sayi;
		}	
		return toplam;	
	}


	public static void main(String[] args) {
		System.out.println("sum = "+topla(1,2,3,4,5,6,7));
		//reference type
		//bellekte nesne üretiyoruz...
		CustomerManager customerManager = new CustomerManager(); 
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();	
		
		System.out.println("*********Other samples***********");
		
		
		Product product = new Product();
		product.set_name("Laptop");
		product.setId(1);
		product.set_description("Asus Laptop");
		product.set_price(5000);
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		System.out.println(product.get_price());
		
		
	
	}

}













