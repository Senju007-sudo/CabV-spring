package org.sid.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.sid.entities.Proprietaire;


public class VeterinaireDAOImpl implements IVeterinaireDAO {
	private Map<String , Proprietaire> proprietaires= new HashMap<String, Proprietaire>();
	
	public void addProprietaire(Proprietaire p) {
		proprietaires.put(p.getId(),p);
	}

	public List<Proprietaire> listProprietaires() {
		return 	new ArrayList<Proprietaire>(proprietaires.values());
	}

	public Proprietaire getProprietaire(String id) {
		return proprietaires.get(id);
	}

	public void deleteProprietaire(String id) {
		proprietaires.remove(id);
		
	}

	public void editProprietaire(Proprietaire p) {
		 proprietaires.put(p.getId(),p);
		
	}
	
	public void initialisation() {
		addProprietaire(new Proprietaire("1","222 222 222 222","Init","Initial","init","033 33 333 33"));
	}
}
