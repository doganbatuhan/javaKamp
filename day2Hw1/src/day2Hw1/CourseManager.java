package day2Hw1;

public class CourseManager {
	
	public void start(Course course) {
		System.out.println(course.name + " kursuna ba�land�.");
	}
	
	public void register(Course course) {
		System.out.println(course.name + " kursuna kayd�n�z yap�lm��t�r.");
	}

	public void add(Course course) {
		System.out.println(course.name + " kursu veri taban�na eklendi.");
	}
	
	public void delete(Course course) {
		System.out.println(course.name + " kursu veri taban�ndan silindi.");
	}
}
