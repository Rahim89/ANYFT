package com.anyft.DAO;

import java.util.List;

import com.anyft.Beans.Driver;

public interface DriverDAO {
	
	public List<Driver> getAllDriver();
	
	public Driver getDriverById(int id);
	
	

}
 