package gameDemo.Concrete;

import gameDemo.Abstract.OrderService;
import gameDemo.Entities.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(Order order) {
		System.out.println("Game id : "+order.getGameId() +  " added to order");
		
	}

	@Override
	public void update(Order order) {
		System.out.println("Game id : "+order.getGameId() +  " updated to order");
		
	}

	@Override
	public void delete(Order order) {
		System.out.println("Game id : "+order.getGameId() +  " deleted to order");
		
	}

}
