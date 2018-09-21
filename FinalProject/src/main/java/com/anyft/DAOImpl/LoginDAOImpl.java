package com.anyft.DAOImpl;

import java.util.ArrayList;
import java.util.List;

//import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.anyft.Beans.Login;
import com.anyft.DAO.LoginDAO;

@Repository
public class LoginDAOImpl implements LoginDAO {
	
	@Autowired
	private SessionFactory session;
	
	@Override
	public void addAccount(Login login) {
		session.getCurrentSession().save(login);
		
	}
	
	@Override
	public void deleteAccount(Login login) {
		session.getCurrentSession().delete(login);
		
	}
	
	@Override
	public void updateAccount(Login login) {
		session.getCurrentSession().update(login);
		
	}

	@Override
	public boolean ckeckLogin(String username, String password) {
		List<Login> loginList = new ArrayList<Login>();
		for(Login login : loginList) {
			if(username.equalsIgnoreCase(login.getUserName()) && password.equalsIgnoreCase(login.getPassword()))
				return true;
					
		}
		return false;
		
		/*session.openSession();
		boolean userFound = false;
		//Query using Hibernate Query Language
		String SQL_QUERY =" from Login as o where o.username=? and o.password=?";
		Query query = session.createQuery(SQL_QUERY);
		query.setParameter(0,username);
		query.setParameter(1,password);
		List list = query.list();

		if ((list != null) && (list.size() > 0)) {
			userFound= true;
		}

		session.close();
		return userFound;   */
	}

	

}
