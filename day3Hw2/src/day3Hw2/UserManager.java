package day3Hw2;

public class UserManager {
	public void register(User user) {
		System.out.println(user.getEmail() + " kayıt oldu");
	}
	
	public void login(User user) {
		System.out.println(user.getEmail() + " giriş yaptı");
	}
}
