
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product(8, "mouse", 33);
		
		manager.add(product);
		
		// static ve inner class'lar için örnekler
		// fakat solid prensiplerine uymadýðý için kullanýmý önerilmez...
		//tek bir class tek bir iþ yapmalýdýr...
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.createConnection();

	}

}
