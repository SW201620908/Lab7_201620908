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
	
	
}
