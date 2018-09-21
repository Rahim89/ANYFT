package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.Transportation;

public interface TransportationDAO {
	
	public int addTransportation(Transportation transport);
	
	public List<Transportation> getAllTransportation();
	
	public Transportation getTransportationByName(String name);
	
	public Transportation getTransportationByTypeLicense(String license);
}
