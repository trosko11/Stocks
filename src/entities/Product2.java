package entities;

public class Product2 {
	
	public String name;
	public Double price;
	
	
	public Product2() {
		
	}
	
	public Product2(String name, Double price) {
		this.name = name;
		this.price = price;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}

	
}
