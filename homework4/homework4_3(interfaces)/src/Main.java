
public class Main {
//interface'lerde abstract class'lar gibi new'lenemezler :( 
	public static void main(String[] args) {
		
		ICustomerDal customerDal = new MySqlCustomerDal();
		CustomerManager customerManager = new CustomerManager(customerDal);
		customerManager.add();
		
		
	}

}
