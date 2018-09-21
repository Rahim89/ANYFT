package com.anyft.DAO;

import java.util.List;

import com.anyft.Beans.Guide;

public interface GuideDAO {
	
	public List<Guide> getAllGuide();
	
	public Guide getGuideByLanguage(String language);

}
