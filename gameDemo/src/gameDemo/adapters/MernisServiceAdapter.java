package gameDemo.adapters;

import java.rmi.RemoteException;

import gameDemo.Abstract.CheckGamerService;
import gameDemo.Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CheckGamerService {

	@Override
	public boolean checkIfRealPerson(Gamer gamer) throws NumberFormatException, RemoteException {
		
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),
				gamer.getFirstName(),
				gamer.getLastName(),
				gamer.getDateOfBirth().getYear());
		
		return result;
				
				
	}

}
