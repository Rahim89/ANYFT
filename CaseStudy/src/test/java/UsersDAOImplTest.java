/**
 * 
 */
package com.springmvc.DAOImpl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.springmvc.Beans.Users;
import com.springmvc.DAO.UsersDAO;

/**
 * @author Rahim
 *
 */
public class UsersDAOImplTest {

//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#addUser(com.springmvc.Beans.Users)}.
//	 * the method testAddUser() insert a new user in the database and return a primary key
//	 */
//	@Test
//	public void testAddUser() {
//		
//		UsersDAO userDAO = new UsersDAOImpl();
//		
//		Users user = new Users();
//		
//		user.setAddress("184 Queens Blvd");
//		
//		
//		user.setCountry("Mali");
//		
//		
//		user.setEmail("malick@gmail.com");
//		
//		
//		user.setFirstName("Mike");
//		
//		
//		user.setLastName("Diallo");
//		
//		
//		user.setPassword("password");
//		
//		
//		user.setPhoneNo("456435321");
//		
//		
//		user.setUserName("test");
//		
//		int key = userDAO.addUser(user);
//		assertTrue(key > 0);
//		
//		
//	}

//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#getUsersByLastName(java.lang.String)}.
//	 * the method search the user by the last name and return the user with that last name.
//	 */
//	@Test
//	public void testGetUsersByLastName() {
//		
//		UsersDAO userDAO = new UsersDAOImpl();
//		
//		Users user = new Users();
//		
//		user.setAddress("184 Queens Blvd");
//		
//		
//		user.setCountry("Mali");
//		
//		
//		user.setEmail("malick@gmail.com");
//		
//		
//		user.setFirstName("Mike");
//		
//		
//		user.setLastName("Diallo");
//		
//		
//		user.setPassword("password");
//		
//		
//		user.setPhoneNo("456435321");
//		
//		
//		user.setUserName("test");
//		
//		Users expected = userDAO.getUsersByLastName("Diallo");
//		
//		assertEquals(user.getLastName(), expected.getLastName());
//	}

	/**
	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#editUser(com.springmvc.Beans.Users)}.
	 * The method update an existing user in the database.
	 */
	@Test
	public void testEditUser() {
		
		UsersDAO userDAO = new UsersDAOImpl();
		
		Users user = new Users();
		
		user.setAddress("184 Chestnut Street Brooklyn");
		
		
		user.setCountry("United States");
		
		
		user.setEmail("test@gmail.com");
		
		
		user.setFirstName("today");
		
		
		user.setLastName("bad");
		
		
		user.setPassword("12345");
		
		
		user.setPhoneNo("3456789876");
		
		
		user.setUserName("test");
		
		userDAO.editUser(user);
		
		Users actual = userDAO.getUsersByUsername("test");
		
		assertEquals(user.getUserId(), actual.getUserId());
		
	}

//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#deleteUser(int)}.
//	 */
//	@Test
//	public void testDeleteUser() {
//		
//		UsersDAO userDAO = new UsersDAOImpl();
//		
//		Users actual = new Users();
//		
//		userDAO.deleteUser(122);
//		
//		
//	}

//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#getUsersByUsername(java.lang.String)}.
//	 */
//	@Test
//	public void testGetUsersByUsername() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.UsersDAOImpl#getAllUsers()}.
//	 */
//	@Test
//	public void testGetAllUsers() {
//		fail("Not yet implemented");
//	}

}
