package homework3_3;

public class CustomerManager {
	private BaseLogger logger;
	
	public CustomerManager(BaseLogger logger) { //bu kýsým çok önemli...
		this.logger = logger;
	}
	
	public void add() {
		System.out.println("musteri eklendi...");
		this.logger.log("log mesajý");
	}

}
