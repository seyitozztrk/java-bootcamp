package core.concretes;

import java.rmi.RemoteException;

import core.abstracts.CustomerCheckService;
import entities.concretes.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCheckAdapter implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(
					Long.parseUnsignedLong(gamer.getTcNo()), 
					gamer.getFirstName(),
					gamer.getLastName(), 
					gamer.getDateOfBirth()
					);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
