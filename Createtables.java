package Oops_project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Createtables {
	public void createTable() throws Exception{
		Database db = new Database();
		 	 Connection con=DriverManager.getConnection(db.url,db.uname,db.pass);
		 	 
			  try {
				  String query="CREATE TABLE IF NOT EXISTS Registration(\r\n"
				  		+ "S_NO int NOT NULL,\r\n"
				  		+ "Reg_no varchar(15) Primary key NOT NULL,\r\n"
				  		+ "Veh_no varchar(15),\r\n"
				  		+ "Maker_name varchar(25) NOT NULL,\r\n"
				  		+ "Owner_name varchar(25)NOT NULL,\r\n"
				  		+ "YOM varchar(15) NOT NULL, \r\n"
				  		+ "Reg_date varchar(15) NOT NULL,\r\n"
						+ "Exp_date varchar(15) NOT NULL\r\n"
				  		+ ");";
				     PreparedStatement ps = con.prepareStatement(query);
				 	 int n =ps.executeUpdate();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  }
	public void createTable2() throws Exception{
		Database db = new Database();
		 	 Connection con=DriverManager.getConnection(db.url,db.uname,db.pass);
		 	 
			  try {
				  String query="CREATE TABLE IF NOT EXISTS licence(\r\n"
				  		+ "S_NO int NOT NULL,\r\n"
				  		+ "DLNO varchar(15) Primary key NOT NULL,\r\n"
				  		+ "NAME varchar(30),\r\n"
				  		+ "ADDRESS varchar(25) NOT NULL,\r\n"
				  		+ "PIN_NUMBER varchar(10)NOT NULL,\r\n"
				  		+ "AGE varchar(3) NOT NULL, \r\n"
				  		+ "GENDER varchar(2) NOT NULL\r\n"
				  		+ ");";
				     PreparedStatement ps = con.prepareStatement(query);
				 	 int n =ps.executeUpdate();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  }
	public void createTable3() throws Exception{
		Database db = new Database();
		 	 Connection con=DriverManager.getConnection(db.url,db.uname,db.pass);
		 	 
			  try {
				  String query="CREATE TABLE IF NOT EXISTS alldetails(\r\n"
				  		+ "S_NO int NOT NULL,\r\n"
				  		+ "REGISTRAION_NUMBER varchar(15) Primary key NOT NULL,\r\n"
				  		+ "VEHICLE_NUMBER varchar(15),\r\n"
						+ "VEHICLE_TYPE varchar(25)NOT NULL,\r\n"
				  		+ "MAKERS_NAME  varchar(25) NOT NULL,\r\n"
				  		+ "YEAR_OF_MANUFACTURE varchar(10)NOT NULL,\r\n"
				  		+ "OWNERS_NAME varchar(30) NOT NULL, \r\n"
				  		+ "REGISTRATION_DATE varchar(15) NOT NULL,\r\n"
						+ "EXPIRY_DATE varchar(15) NOT NULL,\r\n"
						+ "AGE varchar(3) NOT NULL, \r\n"
						+ "GENDER varchar(2) NOT NULL, \r\n"
						+ "ADDRESS varchar(30) NOT NULL, \r\n"
						+ "PIN_NUMBER varchar(10) NOT NULL \r\n"
				  		+ ");";
				     PreparedStatement ps = con.prepareStatement(query);
				 	 int n =ps.executeUpdate();
			  }
			  catch(Exception e){
				  e.printStackTrace();
			  }
		  }
	public void createTable4() throws Exception{
		Database db = new Database();
		 	 Connection con=DriverManager.getConnection(db.url,db.uname,db.pass);
		 	 
			  try {
				  String query="CREATE TABLE IF NOT EXISTS renewal(\r\n"
						+ "reg_no varchar(15) Primary key NOT NULL,\r\n"
						+ "exp_date varchar(10) NOT NULL \r\n"
				  		+ ");";
				     PreparedStatement ps = con.prepareStatement(query);
				 	 int n =ps.executeUpdate();
			  }
			  catch(Exception e){
				  System.out.println(e);
			  }
		  }
	public void createTable5() throws Exception{
		Database db = new Database();
		 	 Connection con=DriverManager.getConnection(db.url,db.uname,db.pass);
		 	 
			  try {
				  String query="CREATE TABLE IF NOT EXISTS transfer(\r\n"
				  	
				  		+ "reg_no varchar(15) Primary key NOT NULL,\r\n"
						+ "owner varchar(30) NOT NULL \r\n"
				  		+ ");";
				     PreparedStatement ps = con.prepareStatement(query);
				 	 int n =ps.executeUpdate();
			  }
			  catch(Exception e){
				  System.out.println(e);
			  }
		  }

}
