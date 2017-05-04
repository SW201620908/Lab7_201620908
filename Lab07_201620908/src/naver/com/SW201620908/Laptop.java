package naver.com.SW201620908;

public class Laptop extends Product implements DataStorage,Networked {

	private double totalCapacity; 
	private double usedCapacity;
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		if(totalCapacity>0) this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		if(usedCapacity>0)this.usedCapacity = usedCapacity;
	}
	

	@Override
	public String getName() {
		return "SAMSUNG";
	}
	
	@Override
	public double getFreeCapacity(){
		return 0.0;
	}

	@Override
	public void format() {
		System.out.println("This Labtop's format is Window 98");
	}

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public double maxSpeed() {
		return 4096;
	}
	
}
