package org.learn.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCApplication {

	static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/test_database?useSSL=false";
	static final String USER_NAME = "root";
	static final String PASSWORD = "root";

	public static void main(String[] args) {

		Connection connection = null;
		Statement statement = null;
		PreparedStatement preparedStatement = null;
		CallableStatement callableStatement = null;

		try {
			Class.forName(DRIVER);
			connection = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
			System.out.println("Database connection establised");
		    statement = connection.createStatement();
			/*
			 * String sqlCreateTable = "CREATE TABLE EMPLOYEE(" +
			 * "ID INT NOT NULL PRIMARY KEY," + "NAME VARCHAR(100) NOT NULL" + ");";
			 */

			statement = connection.createStatement();
			/*
			 * String sqlInsert = "INSERT INTO EMPLOYEE" + "(ID, NAME) " +
			 * "VALUES(1003, 'Sherlock Holmes')";
			 * 
			 * String sqlInsert2 = "INSERT INTO EMPLOYEE" + "(ID, NAME) " +
			 * "VALUES(1004, 'Luke Bates')";
			 */
			String sqpPreparedInsert = "INSERT INTO EMPLOYEE (ID, NAME) VALUES(?, ?)";

			// String sqlUpdate = "UPDATE EMPLOYEE SET NAME='John Smith' WHERE ID=1002";

			String sqlQuery = "SELECT * FROM EMPLOYEE";

			// String sqlDelete = "DELETE FROM EMPLOYEE WHERE ID=1001";

			// statement.execute(sqlCreateTable);
			// statement.executeUpdate(sqlUpdate);
			// ResultSet resultSet = statement.executeQuery(sqlQuery);
			/*
			 * while (resultSet.next()) { System.out.println(resultSet.getInt("ID") + " " +
			 * resultSet.getString("NAME")); // System.out.println(resultSet.getMetaData());
			 * }
			 */
			/*
			 * statement.executeUpdate(sqlInsert); statement.executeUpdate(sqlInsert2);
			 * 
			 * 
			 * while (resultSet2.next()) { System.out.println(resultSet2.getInt("ID") + " "
			 * + resultSet2.getString("NAME")); //
			 * System.out.println(resultSet2.getMetaData()); }
			 */
			// statement.executeUpdate(sqlInsert2);

			/*
			 * preparedStatement = connection.prepareStatement(sqpPreparedInsert);
			 * preparedStatement.setInt(1, 1005); preparedStatement.setString(2,
			 * "Adam Smith"); preparedStatement.executeUpdate();
			 * 
			 * preparedStatement.setInt(1, 1004); preparedStatement.setString(2,
			 * "Richard Knox"); preparedStatement.executeUpdate();
			 */
			String sqlStoredProcedure = "{call our_test_procedure(?,?)}";
			callableStatement = connection.prepareCall(sqlStoredProcedure);
			callableStatement.setInt(1, 1001);
			callableStatement.setString(2, "Other Name");
			callableStatement.executeUpdate();

			ResultSet resultSet2 = statement.executeQuery(sqlQuery);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}

}