package Adapters;

import java.rmi.RemoteException;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
//gerçek senaryoda bu checkservice'i kullanabiliriz.
public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(
					Long.parseUnsignedLong(customer.getNationalityId()), 
					customer.getFirstName(),
					customer.getLastName(), 
					customer.getDateOfBirth()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
}
