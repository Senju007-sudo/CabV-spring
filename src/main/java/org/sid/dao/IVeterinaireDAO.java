package org.sid.dao;

import java.util.List;

import org.sid.entities.Proprietaire;

public interface IVeterinaireDAO {
    public void addProprietaire(Proprietaire p);
    public List<Proprietaire> listProprietaires();
    public Proprietaire getProprietaire(String id);
    public void deleteProprietaire(String id);
    public void editProprietaire(Proprietaire p);
    
}
