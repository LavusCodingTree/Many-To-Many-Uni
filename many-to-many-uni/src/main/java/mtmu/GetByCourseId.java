package mtmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByCourseId {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		
		Course c = em.find(Course.class, 1);
		
		if(c != null) {
			System.out.println("Course Id = "+c.getCid());
			System.out.println("Course Name = "+c.getCourseName());
			System.out.println("Course fee = "+c.getFees());
			System.out.println("===================================");
		}else {
			System.out.println("No Course In The Given Id");
		}
	}
}
