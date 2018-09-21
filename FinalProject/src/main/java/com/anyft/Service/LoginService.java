package com.anyft.Service;

import com.anyft.Beans.Login;

public interface LoginService {
	
	public void addAccount(Login login);
	
	public void deleteAccount(Login login);
	
	public void updateAccount(Login login);
	
	public boolean ckeckLogin(String username, String password);

}
