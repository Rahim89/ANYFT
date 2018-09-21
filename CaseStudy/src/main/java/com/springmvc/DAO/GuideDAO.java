package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.Guide;

public interface GuideDAO {
	
	public List<Guide> getAllGuide();
	
	public Guide getGuideByName(String name);
	
	public Guide getGuideByLanguage(String language);

}
