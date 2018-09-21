package com.anyft.DAO;

import com.anyft.Beans.Tour;

public interface TourDAO {

		public void bookTour(Tour tour);
		
		public void editBookTour(Tour tour);
		
		public void deleteBookTour(int tourId);
}
