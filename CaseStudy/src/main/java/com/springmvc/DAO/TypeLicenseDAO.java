package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.TypeLicense;

public interface TypeLicenseDAO {
	
	public boolean addNewTypeLicense(TypeLicense typeLicense);
	
	public List<TypeLicense> getAllTypeLicense();
	
	public TypeLicense getTypeLicenseByName(String name);
	
	public void updateLicense(TypeLicense license);

}
