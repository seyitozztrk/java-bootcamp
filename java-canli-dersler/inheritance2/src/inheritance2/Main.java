package inheritance2;

public class Main {
//birbirinin alternatifi olan kod blokları if ile yönetilemez !!!!!
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(new EmailLogger());
		
	}
}
