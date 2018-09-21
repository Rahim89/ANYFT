package com.anyft.DAOImpl;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection {
	
	Connection connection=null;
	public Connection getConnection() throws ClassNotFoundException,IOException, SQLException {
	final Properties prop = new Properties();
	final InputStream inputStream = OracleConnection.class.getClassLoader()
			.getResourceAsStream(
					"coreJava/Ressources/db.properties");
	prop.load(inputStream);
	Class.forName(prop.getProperty("driver"));
	 connection = DriverManager.getConnection(prop.getProperty("url"), 
			prop.getProperty("user"), prop.getProperty("password"));
	return connection;
	}
	@SuppressWarnings("null")
	public void closeConnection() {
		final Connection connection = null;
		try {
			 connection.close();
		}catch(Exception e) {
			
		}
	}

}
