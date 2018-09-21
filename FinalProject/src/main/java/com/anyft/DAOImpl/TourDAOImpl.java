package com.anyft.DAOImpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anyft.Beans.Tour;
import com.anyft.DAO.TourDAO;


@Repository
public class TourDAOImpl implements TourDAO {
	
	@Autowired
	private SessionFactory session;

	public void bookTour(Tour tour) {
		// TODO Auto-generated method stub
		
	}

	public void editBookTour(Tour tour) {
		// TODO Auto-generated method stub
		
	}

	public void deleteBookTour(int tourId) {
		// TODO Auto-generated method stub
		
	}

	

}
