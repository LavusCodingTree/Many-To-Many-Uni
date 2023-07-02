package mtmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByStudentId {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Student s = em.find(Student.class, 1);
		
		if(s != null) {
			System.out.println();
			System.out.println("Student Id = "+s.getSid());
			System.out.println("Student Name = "+s.getSname());
			System.out.println("Student Age = "+s.getAge());
			System.out.println("Student Phone = "+s.getPhone());
			System.out.println("===================================");
			
			List<Course> courses = s.getCourses();
			if(courses.size()>0) {
				for(Course c : courses) {
					System.out.println("Course Id = "+c.getCid());
					System.out.println("Course Name = "+c.getCourseName());
					System.out.println("Course Fee = "+c.getFees());
					System.out.println("---------------------------");
				}
			}else {
				System.out.println("Student Not registred any course");
			}
		}else {
			System.out.println("No Student in the Given Id");
		}
	}

}
