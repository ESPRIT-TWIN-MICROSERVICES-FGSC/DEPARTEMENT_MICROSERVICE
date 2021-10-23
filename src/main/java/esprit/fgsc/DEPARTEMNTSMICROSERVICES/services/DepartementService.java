package esprit.fgsc.DEPARTEMNTSMICROSERVICES.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import esprit.fgsc.DEPARTEMNTSMICROSERVICES.entities.Departement;
import esprit.fgsc.DEPARTEMNTSMICROSERVICES.repository.DepartementRepository;

@Service
public class DepartementService {
	@Autowired
	public DepartementRepository DepartementRepository;

public List<Departement>getAllDepartement(){
		 return DepartementRepository.findAll();
	}
	
	public String deleteDepartement(String id) {   
		DepartementRepository.deleteById(id);
    	return "Departement deleted";
	}
	
	public Departement  addDepartement(Departement Departement) {
		
			
			return DepartementRepository.save(Departement);
			
		}

	
	
           
public Departement updateDepartement(String id,Departement newDepartement) {
	if(DepartementRepository.findById(id).isPresent()) {
		Departement existingDepartement = DepartementRepository.findById(id).get();
		existingDepartement.setName(newDepartement.getName());
		existingDepartement.setEmploye(newDepartement.getEmploye());
		existingDepartement.setNumber(newDepartement.getNumber());
		existingDepartement.setDisponible(newDepartement.getDisponible());

		
	    
		return DepartementRepository.save(existingDepartement);
		
	}else {
		return null;
	}
}

public Departement getDepartementById(String id) {
	return DepartementRepository.findById(id).get();
	
}
}
