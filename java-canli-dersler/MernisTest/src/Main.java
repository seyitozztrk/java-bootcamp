import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(2,"SEYÝT AHMET", "ÖZTÜRK", 1995, "66046287188"));
		 
	}

}





