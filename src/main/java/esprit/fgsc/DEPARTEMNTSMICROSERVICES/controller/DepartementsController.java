package esprit.fgsc.DEPARTEMNTSMICROSERVICES.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import esprit.fgsc.DEPARTEMNTSMICROSERVICES.entities.Departement;
import esprit.fgsc.DEPARTEMNTSMICROSERVICES.services.DepartementService;


@CrossOrigin(origins = "*")
@RestController
public class DepartementsController {

	@Autowired
	private  DepartementService DepartementService;
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<Departement> createEmployee(@RequestBody Departement departement) {
		return new ResponseEntity<>(DepartementService.addDepartement(departement), HttpStatus.OK);
	}
	
	
	@GetMapping("/departements")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<List<Departement> >getAllEmployees(){
		 return new ResponseEntity<>(DepartementService.getAllDepartement(),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.OK)
	public String deleteDepartements(@PathVariable String id) {
	    return DepartementService.deleteDepartement(id);
	}

	@PutMapping(value="/update/{id}")
	@ResponseStatus(HttpStatus.OK)
	public ResponseEntity<Departement>deleteDepartement(@PathVariable("id") String id,@Valid @RequestBody Departement departement) {
		return new ResponseEntity<>(DepartementService.updateDepartement(id, departement),HttpStatus.OK);
	}
	


}
