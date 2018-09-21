package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.TourPackage;

public interface TourPackageDAO {
	
	public List<TourPackage> getAllTourPackage();
	
	public TourPackage getTourPackageByName(String names);

}
