package Oops_project;
import java.sql.*;
import java.util.*;
class Database {

		String url="jdbc:mysql://localhost:3306/Oops_project";
	    String uname="root";
	    String pass="Praseeda@572$";
public Database(String url,String uname,String pass) {
	this.url = url;
	this.uname = uname;
	this.pass = pass;
}
public Database() {
	
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
