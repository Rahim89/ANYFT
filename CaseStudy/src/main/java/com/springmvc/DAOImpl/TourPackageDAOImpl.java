package com.springmvc.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.TourPackage;
import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.TourPackageDAO;

public class TourPackageDAOImpl extends OracleConnection implements TourPackageDAO {

	
	@Override
	public List<TourPackage> getAllTourPackage() {
		Connection conn = null;
		List<TourPackage> tourPackages = new ArrayList<TourPackage>();
		
		String sql = "SELECT * FROM TOURPACKAGE";
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				TourPackage tourPackage = new TourPackage();
				tourPackage.setName(rs.getString("names"));
				
				tourPackage.setDescriptions(rs.getString("descriptions"));
				
				tourPackage.setItineraryDescription(rs.getString("ITINERARYDESCRIPTON"));
				
				tourPackage.setDuration_min(rs.getInt("duration_min"));
				
				tourPackage.setDuration_max(rs.getInt("duration_max"));
				
				tourPackage.setGroup_min(rs.getInt("group_min"));
				
				tourPackage.setGroup_max(rs.getInt("group_max"));
				
				tourPackage.setPrice(rs.getDouble("price"));
				
				tourPackage.setPrivates(rs.getString("privates"));
				
				tourPackage.setPrivateSize_min(rs.getInt("privateSize_min"));
				
				tourPackage.setPrivateSize_max(rs.getInt("privateSize_max"));
				
				tourPackage.setPublics(rs.getString("publics"));
				
				tourPackage.setPubliceSize_min(rs.getInt("publicSize_min"));
				
				tourPackage.setPublicSize_max(rs.getInt("publicSize_max"));
				
				tourPackages.add(tourPackage);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return tourPackages;
	}

	@Override
	public TourPackage getTourPackageByName(String names) {
		Connection conn = null;
		TourPackage tourPackage =null;
		String sql = "SELECT * FROM TOURPACKAGE WHERE NAMES = ?";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, names);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				 tourPackage = new TourPackage();
				 tourPackage.setName(rs.getString("name"));
					
				 tourPackage.setDescriptions(rs.getString("descriptions"));
					
				 tourPackage.setItineraryDescription(rs.getString("itineraryDescriptions"));
					
				 tourPackage.setDuration_min(rs.getInt("duration_min"));
					
				 tourPackage.setDuration_max(rs.getInt("duration_max"));
					
				 tourPackage.setGroup_min(rs.getInt("group_min"));
					
				 tourPackage.setGroup_max(rs.getInt("group_max"));
					
				 tourPackage.setPrice(rs.getDouble("price"));
					
				 tourPackage.setPrivates(rs.getString("privates"));
					
				 tourPackage.setPrivateSize_min(rs.getInt("privateSize_min"));
					
				 tourPackage.setPrivateSize_max(rs.getInt("privateSize_max"));
					
				 tourPackage.setPublics(rs.getString("publics"));
					
				 tourPackage.setPubliceSize_min(rs.getInt("publicSize_min"));
					
				 tourPackage.setPublicSize_max(rs.getInt("publicSize_max"));
				
				
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
		return tourPackage;
	}
	

}