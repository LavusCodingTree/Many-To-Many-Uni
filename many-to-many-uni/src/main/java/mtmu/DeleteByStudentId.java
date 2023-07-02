package mtmu;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteByStudentId {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("uday");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s = em.find(Student.class, 20);
		
		if(s != null) {
			et.begin();
			em.remove(s);
			et.commit();
			
		}else {
			System.out.println("No Student in the Given Id");
		}
	}

}
