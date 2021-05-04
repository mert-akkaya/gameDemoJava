package gameDemo;

import java.sql.Date;

import gameDemo.Concrete.CampaignManager;
import gameDemo.Concrete.GameSaleManager;
import gameDemo.Concrete.GamerManager;
import gameDemo.Concrete.OrderManager;
import gameDemo.Entities.Campaign;
import gameDemo.Entities.Game;
import gameDemo.Entities.Gamer;
import gameDemo.Entities.Order;
import gameDemo.adapters.MernisServiceAdapter;

public class Main {

	public static void main(String[] args) throws Exception {
		Gamer gamer1 = new Gamer(1,"Mert","Akkaya",new Date(2000,11,21),"10061591058");
		Game csgo = new Game(1,"Counter Strike",70);
		Game witcher = new Game(2,"The Witcher",50);
		Campaign summerDiscounts = new Campaign(1,30,"Summer Discounts");
		Order order1 = new Order(1, 2);
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.register(gamer1);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(summerDiscounts);
		
		OrderManager orderManager = new OrderManager();
		orderManager.add(order1);
        
		GameSaleManager gameSaleManager = new GameSaleManager(orderManager);
		gameSaleManager.sell(witcher, gamer1, order1, summerDiscounts);
		
	}

}
