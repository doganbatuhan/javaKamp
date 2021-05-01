package day3Hw2;

public class InstructorManager extends UserManager {
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Instructor) user).getFirstName() + " kayýt oldu");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Instructor) user).getFirstName() + " giriþ yaptý");
	}

	public void b(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli öðretmen b metodunu yaptý.");
	}
}
