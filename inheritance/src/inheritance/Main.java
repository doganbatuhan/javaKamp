package inheritance;

public class Main {

	public static void main(String[] args) {

		IndividualCustomer batu = new IndividualCustomer();
		batu.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		CustomerManager customerManager = new CustomerManager();

		Customer[] customers = { batu, hepsiBurada };
		customerManager.addMultiple(customers);

	}

}
