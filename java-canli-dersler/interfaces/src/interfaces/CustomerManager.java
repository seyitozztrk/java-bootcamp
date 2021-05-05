package interfaces;

public class CustomerManager {
	//biz neye baðlýysak onun private deðiþkenini tanýmlamalýyýz.
	private Logger[] loggers;
	
	//bu þekilde log'lamaya baðlýyýz fakat gevþek baðlýyýz.
	
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
	
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi " + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getFirstName());
	}
}

//iki tür baðýmlýlýk vardýr.
//loosly and tightly coupled

//kötü bir baðlýlýk -> loosly
//gevþek baðlýlýk -> tightly 
