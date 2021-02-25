package org.sid.service;

import org.sid.dao.VeterinaireDAOImpl;

public class SingletonService {
	private static VeterinaireServiceImpl service; 
	static {
		VeterinaireDAOImpl dao =  new VeterinaireDAOImpl();
		dao.initialisation();
		service= new VeterinaireServiceImpl();
		service.setDao(dao);
		
	}
	
public static  VeterinaireServiceImpl getService() {
		return service ;
}
	
}
