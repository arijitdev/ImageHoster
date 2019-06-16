package ImageHoster.repository;

import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

@Repository
public class CommentRepository {
	
	@PersistenceUnit(unitName = "imageHoster")
    private EntityManagerFactory emf;
	
	

}
