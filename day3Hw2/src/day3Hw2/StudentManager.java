package day3Hw2;

public class StudentManager extends UserManager {

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Student)user).getFirstName() + " kayıt oldu");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Student)user).getFirstName() + " giriş yaptı");
	}
	
	public void a(Student student) {
		System.out.println(student.getFirstName() + " isimli öğrenci a metodunu yaptı.");
	}
	
}
