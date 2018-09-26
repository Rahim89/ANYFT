/**
 * 
 */
package com.springmvc.DAOImpl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.springmvc.Beans.TypeTransportation;
import com.springmvc.DAO.TypeTransportationDAO;

/**
 * @author Rahim
 *
 */
public class TypeTransportationDAOImplTest {

//	/**
//	 * Test method for {@link com.springmvc.DAOImpl.TypeTransportationDAOImpl#addTypeTransportation(com.springmvc.Beans.TypeTransportation)}.
//	 */
//	@Test
//	public void testAddTypeTransportation() {
//		TypeTransportationDAO typeTranspDAO = new TypeTransportationDAOImpl();
//		
//		TypeTransportation typeTransp =new TypeTransportation();
//		
//		typeTransp.setTypeLicenseName("E");
//		typeTransp.setDescription("the tour will be done by bike ");
//		typeTransp.setTypeTranspName("CAR");
//		
//		typeTranspDAO.addTypeTransportation(typeTransp);
//		
//		assertTrue(true);
//	}

	/**
	 * Test method for {@link com.springmvc.DAOImpl.TypeTransportationDAOImpl#getTypeTransportationByName(java.lang.String)}.
	 */
	@Test
	public void testGetTypeTransportationByName() {
		TypeTransportationDAO typeDAO = new TypeTransportationDAOImpl();
		
		TypeTransportation type = new TypeTransportation();
		
		type.setTypeTranspName("Train");
		type.setDescription("");
		type.setTypeLicenseName("CDL");
		
		TypeTransportation actual = typeDAO.getTypeTransportationByName("Train");
		
		assertEquals(type.getTypeLicenseName(), actual.getTypeLicenseName());
		
		
	}

//	/**
//	 * Test method for {@link java.lang.Object#Object()}.
//	 */
//	@Test
//	public void testObject() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#getClass()}.
//	 */
//	@Test
//	public void testGetClass() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#hashCode()}.
//	 */
//	@Test
//	public void testHashCode() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#equals(java.lang.Object)}.
//	 */
//	@Test
//	public void testEquals() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#clone()}.
//	 */
//	@Test
//	public void testClone() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#toString()}.
//	 */
//	@Test
//	public void testToString() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#notify()}.
//	 */
//	@Test
//	public void testNotify() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#notifyAll()}.
//	 */
//	@Test
//	public void testNotifyAll() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait(long)}.
//	 */
//	@Test
//	public void testWaitLong() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait(long, int)}.
//	 */
//	@Test
//	public void testWaitLongInt() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#wait()}.
//	 */
//	@Test
//	public void testWait() {
//		fail("Not yet implemented");
//	}
//
//	/**
//	 * Test method for {@link java.lang.Object#finalize()}.
//	 */
//	@Test
//	public void testFinalize() {
//		fail("Not yet implemented");
//	}

}
