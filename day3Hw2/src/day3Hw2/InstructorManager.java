package day3Hw2;

public class InstructorManager extends UserManager {
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Instructor) user).getFirstName() + " kay�t oldu");
	}

	@Override
	public void login(User user) {
		// TODO Auto-generated method stub
		System.out.println(((Instructor) user).getFirstName() + " giri� yapt�");
	}

	public void b(Instructor instructor) {
		System.out.println(instructor.getFirstName() + " isimli ��retmen b metodunu yapt�.");
	}
}
