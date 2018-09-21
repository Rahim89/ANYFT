package com.springmvc.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.Guide;
import com.springmvc.DAO.GuideDAO;
import com.springmvc.DAO.OracleConnection;

public class GuideDAOImpl extends OracleConnection implements GuideDAO {

	@Override
	public List<Guide> getAllGuide() {
		Connection conn = null;
		List<Guide> guides = new ArrayList<Guide>();
		
		String sql = "SELECT * FROM GUIDE";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Guide guide = new Guide();
				guide.setFirstName(rs.getString("firstName"));
				guide.setLastName(rs.getString("lastName"));
				guide.setAddress(rs.getString("address"));
				guide.setPhoneNo(rs.getString("phoneNo"));
				guide.setEmail(rs.getString("email"));
				guide.setLanguage(rs.getString("language"));
				guide.setExperience(rs.getInt("experience"));
				
				guides.add(guide);
				
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
		
		return guides;
	}

	@Override
	public Guide getGuideByName(String name) {
		Connection conn = null;
		Guide guide =null;
		String sql = "SELECT * FROM GUDIE WHERE NAME = ?";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				guide = new Guide();
				guide.setFirstName(rs.getString("firstName"));
				guide.setLastName(rs.getString("lastName"));
				guide.setAddress(rs.getString("address"));
				guide.setPhoneNo(rs.getString("phoneNo"));
				guide.setEmail(rs.getString("email"));
				guide.setLanguage(rs.getString("language"));
				guide.setExperience(rs.getInt("experience"));
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
		return guide;
	}

	@Override
	public Guide getGuideByLanguage(String language) {
		Connection conn = null;
		Guide guide =null;
		String sql = "SELECT * FROM GUDIE WHERE LANGUAGE = ?";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, language);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				guide = new Guide();
				guide.setFirstName(rs.getString("firstName"));
				guide.setLastName(rs.getString("lastName"));
				guide.setAddress(rs.getString("address"));
				guide.setPhoneNo(rs.getString("phoneNo"));
				guide.setEmail(rs.getString("email"));
				guide.setLanguage(rs.getString("language"));
				guide.setExperience(rs.getInt("experience"));
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
		return guide;
	}

}
