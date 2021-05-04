package gameDemo.Concrete;

import gameDemo.Abstract.GameSaleService;
import gameDemo.Abstract.OrderService;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;
import gameDemo.Entities.Order;

public class GameSaleManager implements GameSaleService {
	
	OrderService orderService;
	
	public GameSaleManager(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public void sell(Game game, Gamer gamer, Order order, Campaign campaign) {
		if (campaign!=null) {
			System.out.println(game.getName() +" total price : "+ game.getPrice());
			System.out.println(game.getName() +" campaign discount rate : "+campaign.getDiscountRate());
			double result= game.getPrice()-(game.getPrice()*campaign.getDiscountRate()/100);
			System.out.println(game.getName()+ "'s campaign price is : "+result);
		}
		else {
			System.out.println(game.getName()+ "'s price is : "+game.getPrice());}
		
	}

	

}
