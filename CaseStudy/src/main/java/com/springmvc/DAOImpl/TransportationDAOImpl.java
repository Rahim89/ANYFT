package com.springmvc.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.springmvc.Beans.Transportation;
import com.springmvc.DAO.OracleConnection;
import com.springmvc.DAO.TransportationDAO;

public class TransportationDAOImpl implements TransportationDAO {

	@Override
	public int addTransportation(Transportation transport) {

		int key =0;
		String sql= "INSERT INTO Transportation(transportationName, transportationCapacity,comments,typeTranspName) VALUES(?,?,?,?)";
		Connection conn=null;
		String[] generatedkey = {"TRANSPORTATIONID"};
		try { 
				OracleConnection c = new OracleConnection();
				conn = c.getConnection();
				
				PreparedStatement ps = conn.prepareStatement(sql,generatedkey);
				
				ps.setString(1, transport.getTransportationName());
				ps.setInt(2, transport.getTransportationCapacity());
				ps.setString(3, transport.getComments());
				ps.setString(4, transport.getTypeTranspName());
				
				ps.executeUpdate();
				ResultSet rs= ps.getGeneratedKeys();
				
				if(rs.next()){
					
					key=rs.getInt(1);
					transport.setTransportationId(key);
					
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
	public List<Transportation> getAllTransportation() {
		
		List<Transportation> transportlist = new ArrayList<Transportation>();
		
		Connection conn = null;
		
		String sql = "SELECT * FROM TRANSPORTATION";
		
		try {
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				Transportation transport = new Transportation();
				
				transport.setTransportationName(rs.getString("transportationName"));
				transport.setTransportationCapacity(rs.getInt("transportationCapacity"));
				transport.setComments(rs.getString("comments"));
				transport.setTypeTranspName(rs.getString("typeTranspName"));
				
				transportlist.add(transport);
				
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
		
		return transportlist;
	}

	@Override
	public Transportation getTransportationByName(String name) {
		Connection conn = null;
		
		Transportation transport = null;
		
		String sql = "SELECT * FROM TRANSPORTATION WHERE TRANSPORTATIONNAME = ?";
		
		try {
			
			OracleConnection c = new OracleConnection();
			conn = c.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				transport = new Transportation();
				
				transport.setTransportationName(rs.getString("transportationName"));
				transport.setTransportationCapacity(rs.getInt("transportationCapacity"));
				transport.setComments(rs.getString("comments"));
				transport.setTypeTranspName(rs.getString("typeTranspName"));
				
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
		return transport;
	}

	@Override
	public Transportation getTransportationByTypeLicense(String license) {
		// TODO Auto-generated method stub
		return null;
	}

}
