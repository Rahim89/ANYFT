package com.springmvc.DAO;

import java.util.List;

import com.springmvc.Beans.Pictures;
import com.springmvc.Beans.Sites;

public interface PicturesDAO {
	
	public int addPicture(Pictures picture);
	
	public List<Pictures> getAllPictures();
	
	public Pictures getPictureByName(String name);
	
	public void editPicture(Pictures picture);
	
	public void deletePicture(int id);
	
	

}
