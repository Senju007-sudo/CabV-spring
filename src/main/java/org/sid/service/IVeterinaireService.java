package org.sid.service;

import java.util.List;

import org.sid.entities.Proprietaire;

public interface IVeterinaireService {
	 public void addProprietaire(Proprietaire p);
	    public List<Proprietaire> listProprietaires();
	    public Proprietaire getProprietaire(String id);
	    public void deleteProprietaire(String id);
	    public void editProprietaire(Proprietaire p);
	    
}
