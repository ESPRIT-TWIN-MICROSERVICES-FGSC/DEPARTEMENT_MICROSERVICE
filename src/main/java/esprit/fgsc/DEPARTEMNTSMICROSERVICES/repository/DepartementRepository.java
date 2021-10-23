package esprit.fgsc.DEPARTEMNTSMICROSERVICES.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import esprit.fgsc.DEPARTEMNTSMICROSERVICES.entities.Departement;

@Repository
public interface DepartementRepository extends MongoRepository<Departement, String>{

}
