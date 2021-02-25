package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.entities.Proprietaire;

public class VeterinaireDAOJPAImpl implements IVeterinaireDAO {
	@PersistenceContext
	private EntityManager em;
	
	public void addProprietaire(Proprietaire p) {
		em.persist(p);
	}

	public List<Proprietaire> listProprietaires() {
		Query req=em.createQuery("Select p from Prorietaire p ");
		return req.getResultList();
	}

	public Proprietaire getProprietaire(String id) {
		return em.find(Proprietaire.class , id);
	}

	public void deleteProprietaire(String id) {
		Proprietaire p =getProprietaire(id);
		em.remove(p);
	}

	public void editProprietaire(Proprietaire p) {
		em.merge(p);
	}

}
