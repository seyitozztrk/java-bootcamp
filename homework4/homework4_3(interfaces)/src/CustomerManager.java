
public class CustomerManager {
	
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {

		this.customerDal = customerDal;
	}
	
	public void add() {
		//iþ kodlarý yazýlýr...
		customerDal.add();
		System.out.println("Ýþlem bitti..");
	}
}
