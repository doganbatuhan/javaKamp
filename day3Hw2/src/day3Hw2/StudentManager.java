package day3Hw2;

public class StudentManager extends UserManager {

	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Student)user).getFirstName() + " kay�t oldu");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Student)user).getFirstName() + " giri� yapt�");
	}
	
	public void a(Student student) {
		System.out.println(student.getFirstName() + " isimli ��renci a metodunu yapt�.");
	}
	
}
