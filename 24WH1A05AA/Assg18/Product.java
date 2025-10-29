package Assg18;

public class Product {
	private int product_id;
	private String name;
	private double cost;
	
	Product(int product_id,String name,double cost){
		this.product_id=product_id;
		this.name=name;
		this.cost=cost;
	}

	public int getProduct_id() {
		return product_id;
	}

//	public void setProduct_id(int product_id) {
//		this.product_id = product_id;
//	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public double getCost() {
		return cost;
	}

//	public void setCost(double cost) {
//		this.cost = cost;
//	}
	
	

    @Override
    public String toString() {
        return "Product ID: " + product_id + ", Name: " + name + ", Price: " + cost;
    }
}
