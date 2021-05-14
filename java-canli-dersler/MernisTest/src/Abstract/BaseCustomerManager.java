package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICustomerService{

	@Override
	public void save(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("Saved to db : " + customer.getFirstName());
	}
}
