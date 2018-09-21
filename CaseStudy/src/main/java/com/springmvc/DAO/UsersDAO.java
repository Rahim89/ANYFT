package com.springmvc.DAO;



import java.util.List;

import com.springmvc.Beans.Users;

public interface UsersDAO {
	
	 public int addUser(Users user);
	 
	 public Users getUsersByLastName(String lastName);
	 
	 public void editUser(Users user);
	 
	 public void deleteUser(int userId);
	 
	 public Users getUsersByUsername(String username);
	 
	 public List<Users> getAllUsers();

}
