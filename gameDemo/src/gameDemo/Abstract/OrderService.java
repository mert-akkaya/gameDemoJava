package gameDemo.Abstract;

import gameDemo.Entities.Order;

public interface OrderService {
	void add(Order order);
	void update(Order order);
	void delete(Order order);
}
