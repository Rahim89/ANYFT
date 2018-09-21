package com.anyft.DAO;

import com.anyft.Beans.Login;

public interface LoginDAO {
	
	public void addAccount(Login login);
	
	public void deleteAccount(Login login);
	
	public void updateAccount(Login login);
	
	public boolean ckeckLogin(String username, String password);
}
