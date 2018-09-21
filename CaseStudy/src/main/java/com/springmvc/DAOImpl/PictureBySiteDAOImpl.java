package com.springmvc.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.PictureBySite;

import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.PictureBySiteDAO;

public class PictureBySiteDAOImpl extends OracleConnection implements PictureBySiteDAO {

	@Override
	public List<PictureBySite> getAllBySite() {
		
		Connection conn = null;
		List<PictureBySite> picturelist = new ArrayList<>();
	
	String sql = "select  p.pictureName,  p.locationfile from pictures p join sites s on p.siteid = s.siteId";
		
		try {
			
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				PictureBySite picture = new PictureBySite();
				
				
				picture.setPictureName(rs.getString("pictureName"));
				
				picture.setLocationfile(rs.getString("locationFile"));
				
				picturelist.add(picture);
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
		
		return picturelist;
	}

	

}
