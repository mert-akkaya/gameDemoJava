package gameDemo.Concrete;

import gameDemo.Abstract.CheckGamerService;
import gameDemo.Abstract.GamerService;
import gameDemo.Entities.Gamer;

public class GamerManager implements GamerService {

	CheckGamerService checkGamerService;
	
	public GamerManager(CheckGamerService checkGamerService) {
		this.checkGamerService = checkGamerService;
	}
	@Override
	public void register(Gamer gamer) throws Exception {
		if (checkGamerService.checkIfRealPerson(gamer)) {
		  System.out.println(gamer.getFirstName() + " added to system.");
		}else {
			throw new Exception();
		}
		
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " updated to system");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " deleted to system");
		
	}

}
