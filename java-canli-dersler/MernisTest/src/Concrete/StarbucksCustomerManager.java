    package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		
		this._customerCheckService = _customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			
			System.out.println("Savec to dbbb");
			super.save(customer);
		} else {
			System.out.println("Girilen kullanýcý bilgileri hatalýdýr...");
		}
	}	
		
	
}
