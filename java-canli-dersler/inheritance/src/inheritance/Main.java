package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer seyit = new IndividualCustomer();
		seyit.customerNumber = "12345";

		CorporateCustomer hepsiburada = new CorporateCustomer();
		hepsiburada.customerNumber = "789";
		
		SendikaCustomer sendika = new SendikaCustomer();
		sendika.customerNumber = "9999";
		
		CustomerManager manager = new CustomerManager();
		
		Customer[] customers = {seyit, hepsiburada, sendika};
		
		manager.addMultiple(customers);
		
		
		/*bu kodu deðiþtirdik
		manager.add(hepsiburada);
		manager.add(seyit);
		manager.add(sendika);*/
	}

}
