package com.springmvc.DAO;

import com.springmvc.Beans.Tour;

public interface TourDAO {
	
	public int bookTour(Tour tour);
	
	public void editBookedTour(Tour tour);
	
	public void deleteBookedTour(int tourId);

}
