package inheritance2;

public class Main {
//birbirinin alternatifi olan kod bloklar� if ile y�netilemez !!!!!
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
		
	}
}
