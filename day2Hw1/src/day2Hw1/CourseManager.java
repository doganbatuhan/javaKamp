package day2Hw1;

public class CourseManager {
	
	public void start(Course course) {
		System.out.println(course.name + " kursuna başlandı.");
	}
	
	public void register(Course course) {
		System.out.println(course.name + " kursuna kaydınız yapılmıştır.");
	}

	public void add(Course course) {
		System.out.println(course.name + " kursu veri tabanına eklendi.");
	}
	
	public void delete(Course course) {
		System.out.println(course.name + " kursu veri tabanından silindi.");
	}
}
