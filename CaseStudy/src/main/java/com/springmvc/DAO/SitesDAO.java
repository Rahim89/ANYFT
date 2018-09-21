package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.Sites;

public interface SitesDAO {
	
	public int addSites(Sites site);
	
	public List<Sites> getAllSites();
	
	public Sites getSiteByName(String name);
	
	public void updateSite(Sites site);
	
	public void deleteSite(int id);
	


}
