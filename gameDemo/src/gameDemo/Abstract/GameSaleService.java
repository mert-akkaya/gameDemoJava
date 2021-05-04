package gameDemo.Abstract;

import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;
import gameDemo.Entities.Order;

public interface GameSaleService {
	void sell(Game game,Gamer gamer,Order order,Campaign campaign);
}
