
public class CustomerManager {
	
	BaseDatabaseManager baseDatabaseManager;
	
	public void getCustomers(BaseDatabaseManager baseDatabaseManager) {
		this.baseDatabaseManager = baseDatabaseManager;
		baseDatabaseManager.getData();
		
	}
}
