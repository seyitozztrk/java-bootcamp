
//bu projede ama�, farkl� veritabanlar�na m��teriler eklemektir.
//�rne�in; mysql, mssql, oracle gibi farkl� veritabanlar�na veri eklerken y�ntemleri de farkl�d�r.
//bu �al��ma bu soruna y�nelik bir ��z�m sa�lar.

public class Main {
	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.getCustomers(new MysqlServerDatabaseManager());
	}

}
