package com.springmvc.DAOImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.springmvc.Beans.Tour;
import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.TourDAO;

public class TourDAOImpl extends OracleConnection implements TourDAO{

	@Override
	public int bookTour(Tour tour) {
		int key =0;
		String sql = "INSERT INTO TOUR (toupackageId,tourDate,tourTime,pickupLocation,dropoffLocation,transportationId,guideId,driverId,price)values(?,?,?,?,?,?,?,?,?)";
		Connection conn=null;
		String[] generatedkey = {"TOURID"};
		try { 
				OracleConnection c = new OracleConnection();
				conn = c.getConnection();
				
				PreparedStatement ps = conn.prepareStatement(sql,generatedkey);
				ps.setInt(1,tour.getTourPackageId());
				ps.setDate(2,tour.getTourDate());
				ps.setInt(3,tour.getTourTime());
				ps.setString(4,tour.getPickupLocation());
				ps.setString(5, tour.getDropoffLocation());
				ps.setInt(6,tour.getTransportationId());
				ps.setInt(7,tour.getGuideId());
				ps.setInt(8, tour.getDriverId());
				ps.setDouble(9, tour.getPrice());
				
				
				ps.executeUpdate();
				ResultSet rs= ps.getGeneratedKeys();
				if(rs.next())  
				{key=(int)rs.getInt(1);
				tour.setTourId(key);
				}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return key;
		
	}

	@Override
	public void editBookedTour(Tour tour) {
		String sql = "UPDATE TOUR SET toupackageId =?, tourDate =?, tourTime =?, pickupLocation =?, dropoffLocation =?, transportationId =?, guideId =?, driverId =?, price =? where tourId = ?";
		OracleConnection c = new OracleConnection();
		Connection conn=null;
		try {
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
	
			ps.setInt(1,tour.getTourPackageId());
			ps.setDate(2,tour.getTourDate());
			ps.setInt(3,tour.getTourTime());
			ps.setString(4,tour.getPickupLocation());
			ps.setString(5, tour.getDropoffLocation());
			ps.setInt(6,tour.getTransportationId());
			ps.setInt(7,tour.getGuideId());
			ps.setInt(8, tour.getDriverId());
			ps.setDouble(9, tour.getPrice());
			ps.setInt(10, tour.getTourId());
			ps.executeUpdate();

		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deleteBookedTour(int tourId) {
		String sql = "DELETE FROM TOUR WHERE tourId = ?";
		OracleConnection c = new OracleConnection();
		Connection conn=null;
		try {
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
	
			ps.setInt(1, tourId);
			ps.executeUpdate();
		}catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}

}
