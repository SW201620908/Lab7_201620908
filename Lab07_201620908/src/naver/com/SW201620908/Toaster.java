package naver.com.SW201620908;

public class Toaster extends Product implements Cooker {

	@Override
	public String prepareFood() {
		
		return "eat Toasts!";
	}

	@Override
	public String getName() {
		
		return "Toaster is Toaster";
		
	}
	
	

}
