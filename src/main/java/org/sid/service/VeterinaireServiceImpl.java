package org.sid.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import org.sid.dao.IVeterinaireDAO;
import org.sid.entities.Proprietaire;
@Transactional 
public class VeterinaireServiceImpl implements IVeterinaireService {
	private IVeterinaireDAO dao;
	
	public void setDao(IVeterinaireDAO dao) {
		this.dao = dao;
	}

	@Override
	public void addProprietaire(Proprietaire p) {
		dao.addProprietaire(p);
		
	}

	@Override
	public List<Proprietaire> listProprietaires() {
		
		return dao.listProprietaires();
	}

	@Override 
	public Proprietaire getProprietaire(String id) {
		return dao.getProprietaire(id);
	}
	@Override 
	public void deleteProprietaire(String id) {
		dao.deleteProprietaire(id);
	}
	
	@Override
	public void editProprietaire(Proprietaire p) {
		dao.editProprietaire(p);
	}

}
