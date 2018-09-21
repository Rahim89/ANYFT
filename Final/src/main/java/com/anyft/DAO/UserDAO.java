package com.anyft.DAO;

import java.util.List;

import com.anyft.Beans.Users;

public interface UserDAO {
	
	public int userRegistration(Users user);
	
	public void updateUser(Users user);
	
	public Users getUserById(int id);
	
	public List<Users> getAllUsers();
	
	public void removeUser(int id);

}
