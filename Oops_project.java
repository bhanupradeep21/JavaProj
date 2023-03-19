package Oops_project;
import java.sql.SQLException;
import java.sql.*;
import java.util.*;
import Oops_project.*;

class Oops_project {
    public static void main(String arg[]) throws Exception {
        Scanner KB = new Scanner(System.in);
        int op = 0,n=0;
        int select = 0;
//        Createtables ct = new Createtables();
//        ct.createTable();
//        ct.createTable2();
//    	ct.createTable3();
//    	ct.createTable4();
//    	ct.createTable5();
    	boolean r= true;
       while(r) {
    	try {
    		System.out.println("Enter 1 if you are an rto and used to perform rto operations:");
            System.out.println("Enter any other number if you are an user and want to use resources provided by us:");
            select = KB.nextInt();
            r=false;
    	}
    	catch(Exception e){
    		System.out.println("*** Enter valid data ***" );
    		KB.next();
    	}
       }
        if (select == 1) {
            do {
                System.out.println("---------------------");
                System.out.println("|Enter 1 for Log In  |");
                System.out.println("|Enter 2 for Exit    |");
                System.out.println("----------------------"); 
                
                 r= true;
                while(r) {
             	try {
                     op = KB.nextInt();
                     r=false;
             	}
             	catch(Exception e){
             		System.out.println("*** Enter valid data ***" );
             		KB.next();
             	}
                }
                
                switch (op) {
                    case 1:

                        Rtoadmins rt = new Rtoadmins("Bhanu", "1234", "Arun", "9347", "Akash", "9087", "Aditi", "4087",
                                "Mukesh", "2579");
                        String user, pass;
                        System.out.print("Enter your username :");
                        KB.nextLine();
                        user = KB.nextLine();
                        System.out.print("Enter your password :");
                        
                        pass = KB.nextLine();
                        if ((user.equals(rt.getAdmin1()) && pass.equals(rt.getPwd1()))
                                || (user.equals(rt.getAdmin2()) &&
                                        pass.equals(rt.getPwd2()))
                                || (user.equals(rt.getAdmin3()) && pass.equals(rt.getPwd3()))
                                || (user.equals(rt.getAdmin4()) && pass.equals(rt.getPwd4()))
                                || (user.equals(rt.getAdmin5()) && pass.equals(rt.getPwd5()))) {
                        
                        	System.out.print("How Many Vehicle details you want to see: ");
                        	
                        	r= true;
                            while(r) {
                         	try {
                         	    n = KB.nextInt();
                                 r=false;
                         	}
                         	catch(Exception e){
                         		System.out.println("*** Enter valid data ***" );
                         		KB.next();
                         	}
                            }
                            
                            rto C[] = new rto[n];
                            
                            int ch=0;
                            do {
                                System.out.println("-------------------------------------");
                                System.out.println("|          Main Menu                 |");
                                System.out.println("-------------------------------------");
                                System.out.println("| 1.Registration Details             |");
                                System.out.println("| 2.Search By Registration No.       |");
                                System.out.println("| 3.Apply Licence                    |");
                                System.out.println("| 4.Transfer                         |");
                                System.out.println("| 5.Renewal                          |");
                                System.out.println("| 6.Licence details                  |");
                                System.out.println("| 7.Edit Details                     |");
                                System.out.println("| 8.Display All Details              |");
                                System.out.println("| 9.Exit                             |");
                                System.out.println("| 10.Vehicle registration            |");
                                System.out.println("| 11.Search details by ownername     |");
                                System.out.println("| 12.Search details by numericvalue  |");
                                System.out.println("--------------------------------------");
                                System.out.println("Ur Choice :");
                                
                                r= true;
                                while(r) {
                             	try {
                             		ch = KB.nextInt();
                                     r=false;
                             	}
                             	catch(Exception e){
                             		System.out.println("*** Enter valid data ***" );
                             		KB.next();
                             	}
                                }    
                               switch (ch) {
                                    case 1:
                                        for (int i = 0; i < C.length; i++) {
                                            new rto().showAccount();
                                        }
                                        break;

                                    case 2:
                                        System.out.print("Enter Registration No U Want to Search : ");
                                        KB.nextLine();
                                        String acn = KB.nextLine();
                                        boolean found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;

                                    case 3:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                new rto().licence();
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;

                                    case 4:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                new rto().transfer(acn);
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;

                                    case 5:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                new rto().renewal(acn);
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;

                                    case 6:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                new rto().showLicence();
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;
                                    case 7:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                                new rto().edit();
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;

                                    case 8:
                                        System.out.print("Enter your Registration No : ");
                                        KB.nextLine();
                                        acn = KB.nextLine();
                                        found = false;
                                        for (int i = 0; i < C.length; i++) {
                                            found = new rto().search(acn);
                                            if (found) {
                                               new rto().alldetails(acn);
                                                break;
                                            }
                                        }
                                        if (!found) {
                                            System.out.println("Search Failed..Account Not Exist..");
                                        }
                                        break;
                                    case 9:
                                        System.out.println("Good Bye..");
                                        break;
                                        case 10:
                                        	
                                        	
                                        	System.out.println("************************************************************");
                                            System.out.println("           Hello you can now register vehicles");
                                            System.out.println("************************************************************");
                                            
                                            for (int i = 0; i < C.length; i++) {
                                                C[i] = new rto(null, null, null, null, null, null, null, null, null, null, null, null,
                                                        null,
                                                        null, null, null, null, null, null,
                                                        null, null, null, null, null, null, null, null, null);
                                                C[i].registration();
                                            	System.out.println("the details of hashed value for indexing the users");
                                            	System.out.println(C[i].getbranchDetailsAssigned());
                                            }
                                            break;
                                        case 11:
                                        	
                                        	new rto().seachbyowner();
                                        	break;
                                        case 12:
                                     new rto().searchbynumeric();
                                     break;
                                       
                                    default:
                                    	System.out.println("default");
                                       
                                        	
                                }
                            } while (ch != 9);
                        } else {
                            System.out.println("You Have Entered Wrong Username or Password");
                        }
                        break;
                    case 2:
                        System.out.println("Good Bye..");
                        break;
                }
            } while (op != 2);
        }

        else {
            System.out.println("doing user operations");
            int ch2=0;
            System.out.println("How many vehicle details  you want to see");
            
            r= true;
            int a=0;
            while(r) {
         	try {
         		 a = KB.nextInt();
                 r=false;
         	}
         	catch(Exception e){
         		System.out.println("*** Enter valid data ***" );
         		KB.next();
         	}
            }
            
            User b[] = new User[a];
            for (int i = 0; i < a; i++)
                b[i] = new User();

            do {
                System.out.println("-------------------------------------");
                System.out.println("|          Main Menu                 |");
                System.out.println("-------------------------------------");
                System.out.println("| 1.Registration Details             |");
                System.out.println("| 2.Search By Registration No.       |");
                System.out.println("| 3.Licence                          |");
                System.out.println("| 4.Transfer                         |");
                System.out.println("| 5.Renewal                          |");
                System.out.println("| 6.Licence details                  |");
                System.out.println("| 7.Edit Details                     |");
                System.out.println("| 8.Display All Details              |");
                System.out.println("| 9.Help                             |");
                System.out.println("| 10.Exit                            |");
                System.out.println("| 11.Search details by ownername     |");
                System.out.println("| 12.Search details by numericvalue  |");
                System.out.println("--------------------------------------");
                System.out.println("Ur Choice :");
                
                r= true;
                while(r) {
             	try {
             		ch2 = KB.nextInt();
                     r=false;
             	}
             	catch(Exception e){
             		System.out.println("*** Enter valid data ***" );
             		KB.next();
             	}
                }
                 switch (ch2) {
                    case 1:
                        for (int i = 0; i < b.length; i++) {
                            b[i].showAccount();
                        }
                        break;

                    case 2:
                        System.out.println("Enter Registration No U Want to Search : ");
                        KB.nextLine();
                        String acn = KB.nextLine();
                        boolean found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 3:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].licence();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 4:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].transfer(acn);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 5:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].renewal(acn);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 6:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].showLicence();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;
                    case 7:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].edit();
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;

                    case 8:
                        System.out.println("Enter your Registration No : ");
                        KB.nextLine();
                        acn = KB.nextLine();
                        found = false;
                        for (int i = 0; i < b.length; i++) {
                            found = b[i].search(acn);
                            if (found) {
                                b[i].alldetails(acn);
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Search Failed..Account Not Exist..");
                        }
                        break;
                    case 9:
                        for (int i = 0; i < b.length; i++) {
                            b[i].help();
                        }
                        break;
                    case 10:
                        System.out.println("Good Bye..");
                        break;
                    case 11:
                    	for(int i=0;i<b.length;i++) {
                    	b[i].seachbyowner();
                    	}
                    	break;
                    case 12:
                    	for(int i=0;i<b.length;i++) {
                    	b[i].searchbynumeric();
                    	}
                 break;
                   
                    	
                }
            } while (ch2 != 9);

        }
    }
}

