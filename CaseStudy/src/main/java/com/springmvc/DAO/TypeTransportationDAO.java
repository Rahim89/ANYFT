package com.springmvc.DAO;

import com.springmvc.Beans.TypeTransportation;

public interface TypeTransportationDAO {
	
	public boolean addTypeTransportation(TypeTransportation typeTransport);
	
	public TypeTransportation getTypeTransportationByName(String name);

}
