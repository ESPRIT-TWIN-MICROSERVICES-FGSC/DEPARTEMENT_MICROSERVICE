package esprit.fgsc.DEPARTEMNTSMICROSERVICES.entities;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import esprit.fgsc.DEPARTEMNTSMICROSERVICES.services.DepartementService;

@Document
public class Departement {
@Id
private String id;
private String Name;
private String employe;
private String number;
private String disponible  ;



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getName() {
	return Name;
}



public void setName(String name) {
	Name = name;
}



public String getEmploye() {
	return employe;
}



public void setEmploye(String employe) {
	this.employe = employe;
}



public String getNumber() {
	return number;
}



public void setNumber(String number) {
	this.number = number;
}



public String getDisponible() {
	return disponible;
}



public void setDisponible(String disponible) {
	this.disponible = disponible;
}







}
