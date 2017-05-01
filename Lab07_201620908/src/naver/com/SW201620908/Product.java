package naver.com.SW201620908;

abstract public class Product {
	
	private double price;
	
	abstract public String getName();
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		if(price>0.0)
		this.price = price;
	}
	
	

}
