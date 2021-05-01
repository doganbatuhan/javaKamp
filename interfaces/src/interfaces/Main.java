package interfaces;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new FileLogger(), new SmsLogger());
		
		Customer batu = new Customer(1,"Batuhan","Doğan");
		
		customerManager.add(batu);
		

	}

}
