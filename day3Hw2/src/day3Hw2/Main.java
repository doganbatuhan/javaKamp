package day3Hw2;

public class Main {

	public static void main(String[] args) {
		
		User user = new User(1,"asd@asd.com","12345");
		Student student  = new Student();
		student.setFirstName("Batu");
		Instructor instructor = new Instructor(1,"Engin","Demiroğ");
		
		UserManager userManager = new UserManager();
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		userManager.register(user);
		instructorManager.register(instructor);
		studentManager.register(student);
		
		userManager.login(user);
		instructorManager.login(instructor);
		studentManager.login(student);
		
		instructorManager.b(instructor);
		studentManager.a(student);
		
		
		
	}

}
