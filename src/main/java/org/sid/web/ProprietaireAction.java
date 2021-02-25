package org.sid.web;

import java.util.List;

import org.sid.entities.Proprietaire;
import org.sid.service.IVeterinaireService;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

public class ProprietaireAction extends ActionSupport {
	public String id;
	public Proprietaire proprietaire=new Proprietaire();
	public List<Proprietaire> proprietaires;
	@Autowired
	private IVeterinaireService service;
  public String  index() {
		proprietaires = service.listProprietaires();
		return SUCCESS;
  }
  
  public String save() {
	  service.addProprietaire(proprietaire);
	  return SUCCESS;
  }
}  
