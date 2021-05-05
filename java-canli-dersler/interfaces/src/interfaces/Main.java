package interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Logger[] loggers = new Logger[] { new FileLogger(),new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer seyit = new Customer(1, "Seyit", "Öztürk");
		
		customerManager.add(seyit);

	}

}
