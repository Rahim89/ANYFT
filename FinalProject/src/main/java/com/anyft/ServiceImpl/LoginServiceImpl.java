package com.anyft.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.anyft.Beans.Login;
import com.anyft.DAO.LoginDAO;
import com.anyft.Service.LoginService;


@Service

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDAO loginDAO;
	
	@Override
	@Transactional
	public void addAccount(Login login) {
		loginDAO.addAccount(login);
		
	}

	@Override
	@Transactional
	public void deleteAccount(Login login) {
		loginDAO.deleteAccount(login);
		
	}

	@Override
	@Transactional
	public void updateAccount(Login login) {
		loginDAO.updateAccount(login);
		
	}


	@Override
	@Transactional
	public boolean ckeckLogin(String username, String password) {
		
		return loginDAO.ckeckLogin(username, password);
	}

}
