package interfaces;

public class CustomerManager {
	//biz neye ba�l�ysak onun private de�i�kenini tan�mlamal�y�z.
	private Logger[] loggers;
	
	//bu �ekilde log'lamaya ba�l�y�z fakat gev�ek ba�l�y�z.
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("M��teri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}

//iki t�r ba��ml�l�k vard�r.
//loosly and tightly coupled

//k�t� bir ba�l�l�k -> loosly
//gev�ek ba�l�l�k -> tightly 
