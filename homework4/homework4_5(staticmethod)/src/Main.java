
public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product(8, "mouse", 33);
		
		manager.add(product);
		
		// static ve inner class'lar i�in �rnekler
		// fakat solid prensiplerine uymad��� i�in kullan�m� �nerilmez...
		//tek bir class tek bir i� yapmal�d�r...
		DatabaseHelper.Crud.create();
		DatabaseHelper.Connection.createConnection();

	}

}
