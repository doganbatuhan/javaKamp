package day3Hw2;

public class UserManager {
	public void register(User user) {
		System.out.println(user.getEmail() + " kay�t oldu");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail() + " giri� yapt�");
	}
}
