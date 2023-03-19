package Oops_project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

abstract class mainBranch {
	abstract String getAssignedPin();

	void funcofabstract() {
		System.out.println("This abstract class is used for generating hashcode for users");
	}
}

class hQbranch extends mainBranch {
	public String city;
	public int identityNum;
	public String pinCode;

	public hQbranch(String c) {
		this.city = "Sri City";
		this.identityNum = (int) (Math.random());
		this.pinCode = c;
	}

	@Override
	String getAssignedPin() {
		return "#" + this.pinCode + "@" + ((this.identityNum) * 10 - 2) + this.city.charAt(0);
	}

	public String toString() {
		return "[" + this.city + " pin " + this.pinCode + getAssignedPin() + " /]";
	}
}

class rto {
	rto() {

	}

	private String regno, newRegno;
	private String vehno, newVehno;
	private hQbranch branchOrganizing;
	private String cartype, newCartype;
	private String makers, newMakers;
	private String yearofman, newYearofman;
	private String regdate, newRegdate;
	private String expdate, newExpdate;
	private String renewal, newRenewal;
	private String owner, newOwner;
	private String name, newName;
	private String address, newAddress;
	private String age, newAge;
	private String pin, newPin;
	private String gender, newGender;

	Scanner KB = new Scanner(System.in);

	rto(String regno, String newRegno, String vehno, String newVehno, String cartype, String newCartype, String makers,
			String newMakers, String yearofman, String newYearofman, String regdate, String newRegdate, String expdate,
			String newExpdate, String renewal, String newrenewal, String owner, String newowner, String name,
			String newname, String address, String newaddress, String age, String newage, String pin, String newpin,
			String gender, String newgender) {
		this.regno = regno;
		this.newRegno = newRegno;
		this.vehno = vehno;
		this.newVehno = newVehno;
		this.cartype = cartype;
		this.newCartype = newCartype;
		this.makers = makers;
		this.newMakers = makers;
		this.yearofman = yearofman;
		this.newYearofman = newYearofman;
		this.regdate = regdate;
		this.newRegdate = newRegdate;
		this.expdate = expdate;
		this.newExpdate = newExpdate;
		this.renewal = renewal;
		this.branchOrganizing = new hQbranch(pin);
		this.newRenewal = newrenewal;
		this.owner = owner;
		this.newOwner = newowner;
		this.name = name;
		this.newName = newname;
		this.address = address;
		this.newAddress = newaddress;
		this.age = age;
		this.newAge = newage;
		this.pin = pin;
		this.newPin = newpin;
		this.gender = newgender;
		this.newGender = newgender;

	}

	public void setRegno(String regno) {
		this.regno = regno;
	}

	public String getRegno() {
		return regno;
	}

	public void setNewRegno(String newRegno) {
		this.newRegno = newRegno;
	}

	public String getNewRegno() {
		return newRegno;
	}

	public String getNewVehno() {
		return newVehno;
	}

	public void setNewVehno(String newVehno) {
		this.newVehno = newVehno;
	}

	public void setVehno(String vehno) {
		this.vehno = vehno;
	}

	public String getVehno() {
		return vehno;
	}

	public String getCartype() {
		return cartype;
	}

	public void setCartype(String cartype) {
		this.cartype = cartype;
	}

	public String getNewCartype() {
		return newCartype;
	}

	public void setNewCartype(String newCartype) {
		this.newCartype = newCartype;
	}

	public void setMakers(String makers) {
		this.makers = makers;
	}

	public String getMakers() {
		return makers;
	}

	public String getNewMakers() {
		return newMakers;
	}

	public void setNewMakers(String newMakers) {
		this.newMakers = newMakers;
	}

	public String getYearofman() {
		return yearofman;
	}

	public void setYearofman(String yearofman) {
		this.yearofman = yearofman;
	}

	public String getNewYearofman() {
		return newYearofman;
	}

	public void setNewYearofman(String newYearofman) {
		this.newYearofman = newYearofman;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getNewRegdate() {
		return newRegdate;
	}

	public void setNewRegdate(String newRegdate) {
		this.newRegdate = newRegdate;
	}

	public hQbranch getbranchDetailsAssigned() {
		return this.branchOrganizing;
	}

	public String getExpdate() {
		return expdate;
	}

	public void setExpdate(String expdate) {
		this.expdate = expdate;
	}

	public String getNewExpdate() {
		return newExpdate;
	}

	public void setNewExpdate(String newExpdate) {
		this.newExpdate = newExpdate;
	}

	public String getRenewal() {
		return renewal;
	}

	public void setRenewal(String renewal) {
		this.renewal = renewal;
	}

	public String getNewRenewal() {
		return newRenewal;
	}

	public void setNewRenewal(String newRenewal) {
		this.newRenewal = newRenewal;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getNewOwner() {
		return newOwner;
	}

	public void setNewOwner(String newOwner) {
		this.newOwner = newOwner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNewName() {
		return newName;
	}

	public void setNewName(String newName) {
		this.newName = newName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNewAddress() {
		return newAddress;
	}

	public void setNewAddress(String newAddress) {
		this.newAddress = newAddress;
	}

	public String getAge() {
		return age;
	}

	public void setNewAge(String newAge) {
		this.newAge = newAge;
	}

	public String getNewAge() {
		return newAge;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getNewPin() {
		return newPin;
	}

	public void setNewPin(String newPin) {
		this.newPin = newPin;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNewGender() {
		return newGender;
	}

	public void setNewGender(String newGender) {
		this.newGender = newGender;
	}

	public void registration() throws SQLException {

		Scanner sc = new Scanner(System.in);

		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("Enter a S.No:");
		int sno = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter Registration No: ");
		regno = sc.nextLine();
		System.out.print("Enter Vehicle No: ");
		vehno = sc.nextLine();
		System.out.print(
				"Select your vehicle type(Two Wheler/Three Wheeler/Light motor Vehicle/Heavy motor vehicle/Others) :");
		cartype = sc.nextLine();

		System.out.print("Makers Name (Like Datsun,Ford,Tata Motors,Maruti..) : ");
		makers = sc.nextLine();
		String s2 = sc.nextLine();

		System.out.print("Owner's Name: ");
		owner = sc.nextLine();
		sc.nextLine();
		System.out.print("Year of Manufacture: ");
		yearofman = sc.nextLine();
		System.out.print("Registration Date: ");
		regdate = sc.nextLine();
		System.out.print("Expiry Licence Date: ");
		expdate = sc.nextLine();
		System.out.println("----------------------------------------------------------------------------------------");
		Database db = new Database();

		String c = "insert into registration values(?,?,?,?,?,?,?,?,?)";
		String d = "select * from registration";

		Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
		Statement st = con.createStatement();
		PreparedStatement ps = con.prepareStatement(c);
		ps.setInt(1, sno);
		ps.setString(2, regno);
		ps.setString(3, vehno);
		ps.setString(4, cartype);
		ps.setString(5, makers);
		ps.setString(6, owner);
		ps.setString(7, yearofman);
		ps.setString(8, regdate);
		ps.setString(9, expdate);
		int b = 0;
		b = ps.executeUpdate();
		if (b > 0) {
			System.out.println("Inserted");
		}
		ResultSet rs = st.executeQuery(d);

		while (rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5)
					+ rs.getString(6) + rs.getString(7) + rs.getString(8) + rs.getString(9));
		}
	}

	public void edit() {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.print("Enter new S.NO:");
		int s_no = KB.nextInt();
		System.out.print("Enter Registration No: ");
		KB.nextLine();
		newRegno = KB.nextLine();
		regno = newRegno;
		System.out.print("Enter Vehicle No: ");
		newVehno = KB.nextLine();
		vehno = newVehno;
		System.out.print(
				"Select your car type(Two Wheler/Three Wheeler/Light motor Vehicle/Heavy motor vehicle/Others) :");
		newCartype = KB.nextLine();
		cartype = newCartype;
		System.out.print("Makers Name (Like Datsun,Ford,Tata Motors,Maruti..) : ");
		newMakers = KB.nextLine();
		makers = newMakers;
		System.out.print("Owner's Name: ");
		newOwner = KB.nextLine();
		owner = newOwner;
		System.out.print("Year of Manufacture: ");
		newYearofman = KB.nextLine();
		yearofman = newYearofman;
		System.out.print("Registration Date: ");
		newRegdate = KB.nextLine();
		regdate = newRegdate;
		System.out.print("Expiery Licence Date: ");
		newExpdate = KB.nextLine();
		expdate = newExpdate;
		System.out.print("Your Address :");
		newAddress = KB.nextLine();
		address = newAddress;
		System.out.print("Your PIN no :");
		newPin = KB.nextLine();
		pin = newPin;
		System.out.print("Your age :");
		newAge = KB.nextLine();
		age = newAge;
		System.out.print("Your Gender :");
		newGender = KB.nextLine();
		gender = newGender;
		System.out.println("---------------------------------------------------------------------------------------");
		try {
			System.out.println("Enter registration number you want to update details");
			String regist = KB.nextLine();
			Database db = new Database();
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
			Statement st = con.createStatement();
			String c = "update alldetails set S_NO=\""+s_no+"\",REGISTRAION_NUMBER=\""+regno+"\",VEHICLE_NUMBER=\""+vehno+"\","
					+ "VEHICLE_TYPE=\""+cartype+"\",MAKERS_NAME=\""+makers+"\",YEAR_OF_MANUFACTURE=\""+yearofman+"\","
					+ "OWNERS_NAME=\""+owner+"\",REGISTRATION_DATE=\""+regdate+"\",EXPIRY_DATE=\""+expdate+"\",AGE=\""+age+"\","
					+ "GENDER=\""+gender+"\",ADDRESS=\""+address+"\",PIN_NUMBER=\""+pin+"\" where REGISTRAION_NUMBER=\""+regist+"\"";
			String d = "select * from alldetails where REGISTRAION_NUMBER=\""+regno+"\";";
			
			boolean b =st.execute(c);
			System.out.println(b);
			ResultSet rs = st.executeQuery(d);
			while(rs.next()) {
				System.out.println("S_NO:"+rs.getInt(1));
				System.out.println("Registartion number:"+rs.getString(2));
				System.out.println("Vehicle number:"+rs.getString(3));
				System.out.println("Vehicle type:"+rs.getString(4));
				System.out.println("Makers name:"+rs.getString(5));
				System.out.println("Year of manufacture:"+rs.getString(6));
				System.out.println("Owners name:"+rs.getString(7));
				System.out.println("Registration date:"+rs.getString(8));
				System.out.println("Expiry date:"+rs.getString(9));
				System.out.println("Age:"+rs.getString(10));
				System.out.println("Gender:"+rs.getString(11));
				System.out.println("Address:"+rs.getString(12));
				System.out.println("Pin number:"+rs.getString(13));
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			System.out.println("If you want to delete any details press 1");
			boolean m= true;
            int p=0;
			while(m) {
	         	try {
	         		 p = KB.nextInt();
	                 m=false;
	         	}
	         	catch(Exception e){
	         		System.out.println("*** Enter valid data ***" );
	         		KB.next();
	         	}
	            }
			if(p==1) {
				try {
					 db = new Database();
					 con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
					 st = con.createStatement();
					 System.out.println("Enter the registration number where details to be delete");
					 String delreg = KB.nextLine();
					 String del = "delete alldetails where REGISTRAION_NUMBER=\""+delreg+"\"";
					 String delprint = "select * from alldetails";
					 Boolean found= search(delreg);
					 if(found) {
						 boolean bool = st.execute(del);
						 ResultSet resset = st.executeQuery(delprint);
						 while(resset.next()) {
								System.out.println("S_NO:"+rs.getInt(1));
								System.out.println("Registartion number:"+rs.getString(2));
								System.out.println("Vehicle number:"+rs.getString(3));
								System.out.println("Vehicle type:"+rs.getString(4));
								System.out.println("Makers name:"+rs.getString(5));
								System.out.println("Year of manufacture:"+rs.getString(6));
								System.out.println("Owners name:"+rs.getString(7));
								System.out.println("Registration date:"+rs.getString(8));
								System.out.println("Expiry date:"+rs.getString(9));
								System.out.println("Age:"+rs.getString(10));
								System.out.println("Gender:"+rs.getString(11));
								System.out.println("Address:"+rs.getString(12));
								System.out.println("Pin number:"+rs.getString(13));
							}
						 
					 }
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}

	public void licence() {

		System.out.println("------------------------------------");
		System.out.println("Enter S_no");
		int sno = KB.nextInt();
		System.out.println("Enter DLNO:");
		String DLNO = KB.nextLine();
		KB.nextLine();
		System.out.print("Your name :");
		name = KB.nextLine();
		KB.nextLine();
		System.out.print("Your Address :");
		address = KB.nextLine();
		System.out.print("Your PIN no :");
		pin = KB.nextLine();
		System.out.print("Your age :");
		age = KB.nextLine();
		System.out.print("Your Gender :");
		gender = KB.nextLine();
		System.out.println("------------------------------------");
		try {
			Database db = new Database();
			String c = "insert into licence values(?,?,?,?,?,?,?)";
			String d = "select * from licence";
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
			Statement st = con.createStatement();
			PreparedStatement ps = con.prepareStatement(c);
			ps.setInt(1, sno);
			ps.setString(2, DLNO);
			ps.setString(3, name);
			ps.setString(4, address);
			ps.setString(5, pin);
			ps.setString(6, age);
			ps.setString(7, gender);

			int b = 0;
			b = ps.executeUpdate();
			if (b > 0) {
				System.out.println("Inserted");
			}
			ResultSet rs = st.executeQuery(d);

			while (rs.next()) {
				System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5)
						+ rs.getString(6) + rs.getString(7));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void showLicence() {
		try {

			System.out.println("Enter DLNO on your licence to see licence details");
			String rrr = KB.nextLine();
			Database db = new Database();
			String regdata = "select * from licence where DLNO=\"" + rrr + "\"";
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(regdata);
			while (rs.next()) {
				System.out.println("------------------------------------");
				System.out.println("S.No :" + "" + rs.getInt(1));
				System.out.println("DLNO :" + " " + rs.getString(2));
				System.out.println("Name :" + " " + rs.getString(3));
				System.out.println("Address :" + " " + rs.getString(4));
				System.out.println("Pin No. :" + " " + rs.getString(5));
				System.out.println("Age :" + " " + rs.getString(6));
				System.out.println("Gender :" + " " + rs.getString(7));
				System.out.println("------------------------------------");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	public void renewal(String acn) {
		System.out.println("------------------------------------");
		System.out.print("Enter the expiery date:");
		renewal = KB.nextLine();
		expdate = renewal;
		System.out.println("------------------------------------");
		try {
			Database db = new Database();
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
			Statement st = con.createStatement();
			String query = "update renewal set exp_date=\""+expdate+"\" where reg_no=\""+acn+"\"";
			String d = "select * from renewal where reg_no=\""+acn+"\"";
			boolean b = st.execute(query);
			ResultSet rs = st.executeQuery(d);
			while(rs.next()) {
				System.out.println("Registration number:"+rs.getString(1));
				System.out.println("New Expiery date:"+rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        ArrayList<String> ren = new ArrayList<String>();
		ren.add(""+expdate);
		String[] str = new String[ren.size()];
		for(int i=0;i<ren.size();i++) {
			System.out.println("a[i]:"+ren.get(i));
    }
	}

	// method to withdraw money
	public void transfer(String acn) {
		System.out.println("------------------------------------");
		System.out.print("Enter The New Owner Name :");
		newOwner = KB.nextLine();
		owner = newOwner;
		System.out.println("------------------------------------");
		try {
			Database db = new Database();
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
			Statement st = con.createStatement();
			String query = "update transfer set owner=\""+owner+"\" where reg_no=\""+acn+"\"";
			String d = "select * from transfer where reg_no=\""+acn+"\"";
			boolean b = st.execute(query);
			ResultSet rs = st.executeQuery(d);
			while(rs.next()) {
				System.out.println("Registration number:"+rs.getString(1));
				System.out.println("New owner:"+rs.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
        ArrayList<String> ren = new ArrayList<String>();
		ren.add(""+expdate);
		String[] str = new String[ren.size()];
		for(int i=0;i<ren.size();i++) {
			System.out.println("a[i]:"+ren.get(i));
		}
    }

	public void showAccount() throws SQLException {
		try {
			System.out.println("Enter registration number of vehicle you want to see:");
			String rrr = KB.nextLine();
			Database db = new Database();
//    	if(rrr.compareTo("AP/45/KT35")==0) System.out.println("Matched");
			String regdata = "select * from registration where Reg_no=\"" + rrr + "\"";
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());

			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(regdata);
			while (rs.next()) {
				System.out.println("---------------------------------------");
				System.out.println("|S.NO:" + "" + rs.getInt(1));
				System.out.println("|Registration No :" + " " + rs.getString(2));
				System.out.println("|Vehicle No :" + " " + rs.getString(3));
				System.out.println("|Car Type :" + " " + rs.getString(4));
				System.out.println("|Makers Name :" + " " + rs.getString(5));
				System.out.println("|Year of Manufacture :" + " " + rs.getString(6));
				System.out.println("|Owner's Name :" + " " + rs.getString(7));
				System.out.println("|Registration Date :" + " " + rs.getString(8));
				System.out.println("|Expiery Date :" + " " + rs.getString(9));
				System.out.println("---------------------------------------");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void alldetails(String rrr) {
		try {
			Database db = new Database();
			String regdata = "select * from alldetails where REGISTRAION_NUMBER=" + rrr + "";
			Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(regdata);
			while (rs.next()) {
				System.out.println("---------------------------------------");
				System.out.println("  |S.NO :" + "" + rs.getInt(1));
				System.out.println("  |Registration No :" + " " + rs.getString(2));
				System.out.println("  |Vehicle No :" + " " + rs.getString(3));
				System.out.println("  |Vehicle Type :" + " " + rs.getString(4));
				System.out.println("  |Makers Name :" + " " + rs.getString(5));
				System.out.println("  |Year of Manufacture :" + "" + rs.getString(6));
				System.out.println("  |Owner's Name :" + " " + rs.getString(7));
				System.out.println("  |Registration Date :" + " " + rs.getString(8));
				System.out.println("  |Expiery Date :" + " " + rs.getString(9));
				System.out.println("  |Age :" + " " + rs.getString(10));
				System.out.println("  |Gender :" + " " + rs.getString(11));
				System.out.println("  |Address :" + " " + rs.getString(12));
				System.out.println("  |Pin No. :" + " " + rs.getString(13));
				System.out.println("--------------------------------------");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public boolean search(String acn) throws SQLException {
		Database db = new Database();
		String regdata = "select * from registration where Reg_no=\"" + acn + "\"";
		Connection con = DriverManager.getConnection(db.getUrl(), db.getUname(), db.getPass());

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(regdata);
		while (rs.next()) {
			if (rs.getString(2).equals(acn)) {
				System.out.println("found");
				// below show function is written if we want to see details associated with that
				// registration number
				showAccount();
				return (true);
			}
		}
		return (false);
	}

	public void seachbyowner() {
		try {
			Scanner in = new Scanner(System.in);
	        Database db = new Database();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(db.url,db.uname,db.pass);
			System.out.println("Enter name:");
			String query = "";
			String query2 = "";
			String person_name = in.nextLine(); 
			query = "select * from alldetails where owners_name LIKE '% " + person_name + "' ";
			query2 = "select * from alldetails where owners_name LIKE '" + person_name + "%'";
			Statement ps = con.createStatement();
			ResultSet r1 = ps.executeQuery(query);
			Statement ps2 = con.createStatement();
			ResultSet r2 = ps2.executeQuery(query2);
			while (r1.next()) {
				System.out.println(r1.getInt(1)+r1.getString(2)+r1.getString(3)+r1.getString(4)+r1.getString(5)+r1.getString(6)+r1.getString(7)+r1.getString(8)+r1.getString(9)+r1.getString(10)+r1.getString(11)+r1.getString(12)+r1.getString(13));
			}
			while (r2.next()) {
				System.out.println(r2.getInt(1)+r2.getString(2)+r2.getString(3)+r2.getString(4)+r2.getString(5)+r2.getString(6)+r2.getString(7)+r2.getString(8)+r2.getString(9)+r2.getString(10)+r2.getString(11)+r2.getString(12)+r2.getString(13));
			}
			System.out.println("--------------------------------------------------------------------");
		    } catch (Exception e) {
		    	e.printStackTrace();
		    }
		
	}

	public void searchbynumeric() {
		try {
			Database db = new Database();
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(db.url,db.uname,db.pass);
			System.out.println("Enter S_no:");
			int q = KB.nextInt();
			String query = "select * from alldetails where s_no =\""+q+"\"";
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getInt(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+rs.getString(8)+rs.getString(9)+rs.getString(10)+rs.getString(11)+rs.getString(12)+rs.getString(13));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
