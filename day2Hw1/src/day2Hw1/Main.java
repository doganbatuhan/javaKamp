package day2Hw1;

public class Main {

	public static void main(String[] args) {

		// Courses
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demirog", 0.91);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin Demirog", 0.32);
		Course course3 = new Course(3, "Programlamaya Giriþ için Temel Kurs", "Engin Demirog", 0.07);
		Course[] courses = { course1, course2, course3 };

		// Printing list of Courses
		System.out.println("Kurs Listesi\n******************");
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		System.out.println();
		// Categories
		System.out.println("Kategori Listesi\n******************");
		Category category1 = new Category(1, "Programlama");
		Category category2 = new Category(2, "Kariyer");
		Category[] categories = new Category[2];
		categories[0] = category1;
		categories[1] = category2;
		
		// Printing list of Categories
		for (int i = 0; i < categories.length; i++) {
			System.out.println(categories[i].name);
		}
		
		System.out.println();
		
		
		System.out.println("Veri Tabaný Ýþlemleri\n*******************");
		CourseManager courseManager = new CourseManager();
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.delete(course1);
		System.out.println("Proje sonu");
		

	}

}