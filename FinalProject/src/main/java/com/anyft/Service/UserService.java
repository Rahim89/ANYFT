package com.anyft.Service;

import com.anyft.Beans.Users;

public interface UserService {
	
public void addUser(Users user);
	
	public void updateUser(Users user);
	
	public void deleteUser(int userId);

}
