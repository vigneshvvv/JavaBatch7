package sample;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class DataBaseConfiguration {
	
	String hostName = "jdbc:mysql://localhost:3306/javatrainingpro";
	String user = "root";
	String password  = "Vignesh333#";
	Connection connection;
	
	public void getCustomers() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(hostName, user, password);
		Statement st = connection.createStatement();
		ResultSet result = st.executeQuery("select * from customers");
		
		
		List<CustomerDataSet> customerDataSets = new ArrayList<CustomerDataSet>();
		
		while(result.next()) {
			CustomerDataSet  customerDataSet = new CustomerDataSet();
			customerDataSet.setCustomer_id(result.getInt("customer_id"));
			customerDataSet.setCustomer_name(result.getString("customer_name"));
			customerDataSet.setAddress(result.getString("address"));
			customerDataSet.setCountry(result.getString("country"));
			customerDataSets.add(customerDataSet);
		}
		
		System.out.println(customerDataSets);
	}
	
	public void insertOperation(CustomerDataSet customerDataSet) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(hostName, user, password);
		PreparedStatement preparedStatement = connection.prepareStatement("insert into customers (customer_name, email_id, mobile_number, country) values(?,?,?,?)");
		preparedStatement.setString(1, customerDataSet.getCustomer_name());
		preparedStatement.setString(2, customerDataSet.getEmail_id());
		preparedStatement.setString(3,"34242343" );
		preparedStatement.setString(4,customerDataSet.getCountry() );
		
		preparedStatement.execute();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
