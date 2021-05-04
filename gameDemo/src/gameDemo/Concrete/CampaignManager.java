package gameDemo.Concrete;

import gameDemo.Abstract.CampaignService;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;

public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getName() + " created");
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getName() + " updated");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getName() + " deleted");
		
	}


}
