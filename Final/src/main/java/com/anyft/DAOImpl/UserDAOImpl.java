package com.anyft.DAOImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.anyft.Beans.Users;
import com.anyft.DAO.UserDAO;

public class UserDAOImpl extends OracleConnection implements UserDAO{

	@Override
	public int userRegistration(Users user) {
		int status =0;
		String sql= "INSERT INTO USERS(firstname,lastname,address,email,country,phoneNo) VALUES(?,?,?,?,?,?)";
		Connection conn=null;
		
		try {
				OracleConnection c = new OracleConnection();
				conn = c.getConnection();
				PreparedStatement ps = conn.prepareStatement(sql);
				
				ps.setString(1, user.getFirstName());
				ps.setString(2, user.getLastName());
				ps.setString(3, user.getAddress());
				ps.setString(4, user.getEmail());
				ps.setString(5, user.getCountry());
				ps.setString(6, user.getPhoneNo());
				
				status=ps.executeUpdate();
				
				
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
		return status;
	}

	@Override
	public void updateUser(Users user) {
		String sql=" UPDATE USERS SET firstName=?, lastName=?, address=?, email=?, country=?, phoneNo=? where userId=";
		
	}

	@Override
	public Users getUserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
