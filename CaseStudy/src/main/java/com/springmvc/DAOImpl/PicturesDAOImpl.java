package com.springmvc.DAOImpl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.Pictures;

import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.PicturesDAO;

public class PicturesDAOImpl extends OracleConnection implements PicturesDAO {

	@Override
	public int addPicture(Pictures picture) {
		int key =0;
		String sql= "INSERT INTO pictures(pictureName,siteId,locationFile) VALUES(?,?,?)";
		Connection conn=null;
		String[] generatedkey = {"PICTUREID"};
		try { 
				OracleConnection c = new OracleConnection();
				conn = c.getConnection();
				
				PreparedStatement ps = conn.prepareStatement(sql,generatedkey);
				
				ps.setString(1, picture.getPictureName());
				ps.setInt(2, picture.getSiteId());
				ps.setString(3, picture.getLocationFile());
				
		
				ps.executeUpdate();
				ResultSet rs= ps.getGeneratedKeys();
				
				if(rs.next()){
					
					key=rs.getInt(1);
					picture.setSiteId(key);
					
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
		
		return key;
	}

	
	@Override
	public List<Pictures> getAllPictures() {

		Connection conn = null;
		List<Pictures> picturelist = new ArrayList<Pictures>();
	
	String sql = "SELECT * FROM pictures";
		
		try {
			
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Pictures picture = new Pictures();
				
				picture.setPictureName(rs.getString("pictureName"));
				picture.setSiteId(rs.getInt("siteId"));
				picture.setLocationFile(rs.getString("locationFile"));
				
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

	@Override
	public Pictures getPictureByName(String name) {

		Connection conn = null;
		Pictures picture =null;
		String sql = "SELECT * FROM PICTURES WHERE PICTURENAME = ?";
		
		try {
			
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				picture = new Pictures();
				 
				picture.setPictureName(rs.getString("pictureName"));
				picture.setSiteId(rs.getInt("siteId"));
				picture.setLocationFile(rs.getString("locationFile"));
				
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
		
		return picture;
	}

	@Override
	public void editPicture(Pictures picture) {
		
		String sql = "UPDATE sites SET siteName =?, mainPicture =?, locations =?, timeneed =? where siteId = ?";
		OracleConnection c = new OracleConnection();
		Connection conn=null;
		try {
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
	
			ps.setString(1, picture.getPictureName());
			ps.setInt(2, picture.getSiteId());
			ps.setString(3, picture.getLocationFile());
			ps.setInt(4, picture.getSiteId());
			ps.executeUpdate();

		} catch (ClassNotFoundException | IOException | SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}


	}

	@Override
	public void deletePicture(int id) {
		
		String sql = "DELETE FROM PICTURES WHERE pictureId = ?";
		OracleConnection c = new OracleConnection();
		Connection conn=null;
		try {
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
	
			ps.setInt(1, id);
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
