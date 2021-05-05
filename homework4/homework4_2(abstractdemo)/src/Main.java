
//bu projede amaç, farklý veritabanlarýna müþteriler eklemektir.
//örneðin; mysql, mssql, oracle gibi farklý veritabanlarýna veri eklerken yöntemleri de farklýdýr.
//bu çalýþma bu soruna yönelik bir çözüm saðlar.

public class Main {
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.getCustomers(new MysqlServerDatabaseManager());
	}

}
