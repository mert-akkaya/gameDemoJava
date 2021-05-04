package gameDemo.Entities;

import gameDemo.Abstract.Entity;

public class Campaign implements Entity {

	private int id;
	private int discountRate;
	private String name;
	
	public Campaign() {
		
	}

	public Campaign(int id, int discountRate,String name) {
		super();
		this.id = id;
		this.discountRate = discountRate;
		this.name= name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	
}
