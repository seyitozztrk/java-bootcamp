import java.rmi.RemoteException;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1,"isim(büyük harflerle)", "soyisim(büyük harflerle)", "doğum yılı(int şeklinde)", "tc yaz buraya"));
		
		BaseCustomerManager customerManager2 = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager2.save(new Customer(1,"isim(büyük harflerle)", "soyisim(büyük harflerle)", "doğum yılı(int şeklinde)", "tc yaz buraya"));
		 
	}

}





