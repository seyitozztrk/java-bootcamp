package Concrete;

import Entities.Customer;
import Abstract.ICustomerCheckService;

//sahte senaryo ihtiyac�m�zda bu s�n�f� kullanabiliriz.
public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;
	}

}
