package naver.com.SW201620908;

public class SmartTV extends Product implements Networked{

	
	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel>0)
		this.channel = channel;
	}

	@Override
	public String getName() {
		return "Howzen";
	}

	@Override
	public boolean isConnected() {
		return false;
	}

	@Override
	public double maxSpeed() {
		return 1024;
	}

}
