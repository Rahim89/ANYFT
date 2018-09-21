package com.anyft.DAO;

import com.anyft.Beans.Users;

public interface UserDAO {
	public void addUser(Users user);
	
	public void updateUser(Users user);
	
	public void deleteUser(int userId);
}
