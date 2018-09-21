package coreJava.DAO;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class OracleConnection {

	public Connection getConnection() throws ClassNotFoundException, SQLException, IOException {
		final Properties prop = new Properties();
		final InputStream inputStream = OracleConnection.class.getClassLoader()
				.getResourceAsStream("coreJava/Ressources/db.properties");
		prop.load(inputStream);
		Class.forName(prop.getProperty("driver"));
		final Connection conn = DriverManager.getConnection(prop.getProperty("url"), 
				prop.getProperty("user"), prop.getProperty("password"));
		
		
		return conn;
	}
}