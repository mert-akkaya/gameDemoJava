package gameDemo.Abstract;

import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;

public interface CampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(Campaign campaign);
}
