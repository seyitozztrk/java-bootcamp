package Concrete;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import Abstract.ICustomerCheckService;

//sahte senaryo ihtiyacýmýzda bu sýnýfý kullanabiliriz.
public class CustomerCheckManager implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {

		return true;
	}

}
