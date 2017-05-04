package naver.com.SW201620908;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ProductTest {

	public static void main(String[] args) {
		
		ProductTest PT=new ProductTest();
		Product p=new Laptop();
		PT.testProduct(p);
		System.out.println();
		
		DataStorage d=new Laptop();
		PT.testDateStorage(d);
		System.out.println();
		
		Networked n = new SmartTV();
		PT.testNetworked(n);
		System.out.println();
		
		Cooker c = new Toaster();
		PT.testCooker(c);
	}
	
	public void testProduct(Product p){
		p.setPrice(3000000);
		System.out.println("Price : "+p.getPrice());
		((Laptop) p).format();
		System.out.println("Name : "+p.getName());
	}
	
	public void testDateStorage(DataStorage d){
		System.out.println("Free capacity : "+d.getFreeCapacity());
		((Laptop)d).format();
		((Laptop)d).setTotalCapacity(1024);
		System.out.println("Capacity : "+((Laptop)d).getTotalCapacity());
	}
	
	public void testNetworked(Networked n){
		System.out.println("Is connected? "+n.isConnected());
		System.out.println("MaxSpeed : "+n.maxSpeed());
		System.out.println("Name : "+((SmartTV)n).getName());
		((SmartTV)n).setChannel(5);
		System.out.println("Channel : "+((SmartTV)n).getChannel());
	}
	
	public void testCooker(Cooker c){
		System.out.println("PrepareFood : "+c.prepareFood());
		System.out.println("Name : "+((Toaster)c).getName());
	}
	
	
}
