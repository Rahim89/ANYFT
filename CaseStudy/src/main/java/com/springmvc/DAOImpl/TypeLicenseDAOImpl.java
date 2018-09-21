package com.springmvc.DAOImpl;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.TypeLicense;
import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.TypeLicenseDAO;

public class TypeLicenseDAOImpl extends OracleConnection implements TypeLicenseDAO {

	@Override
	public boolean addNewTypeLicense(TypeLicense typeLicense) {

		boolean itWorked = false;
		String sql = "INSERT INTO typeLicense(typeLicenseName, description) values(?,?)";
		Connection conn=null;
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, typeLicense.getTypelicenseName());
			ps.setString(2, typeLicense.getDescription());
			
			itWorked = ps.executeUpdate() > 0 ? true : false;
		}catch (Exception e) {
			
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return itWorked;
	}

	@Override
	public List<TypeLicense> getAllTypeLicense() {
		Connection conn=null;
		String sql = "SELECT * FROM typeLicense";
		List<TypeLicense> licenselist = new ArrayList<TypeLicense>();
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				TypeLicense license = new TypeLicense();
				
				license.setTypelicenseName(rs.getString("typeLicenseName"));
				license.setDescription(rs.getString("description"));
				
				licenselist.add(license);
			}
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
		return licenselist;
	}

	@Override
	public TypeLicense getTypeLicenseByName(String name) {
		
		Connection conn = null;
		TypeLicense license = null;
		String sql = "SELECT * FROM TYPELICENSE WHERE typeLicenseName = ?";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				license = new TypeLicense();
				
				license.setTypelicenseName(rs.getString("typeLicenseName"));
				license.setDescription(rs.getString("description"));
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
		
		return license;
	}

	@Override
	public void updateLicense(TypeLicense license) {
		
		Connection conn = null;
		String sql = "UPDATE TYPELICENSE SET DESCRIPTION = ? WHERE TYPELICENSENAME = ?";
		
		try {
			
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, license.getDescription());
			ps.setString(2, license.getTypelicenseName());
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
