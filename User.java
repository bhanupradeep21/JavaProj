package Oops_project;

import java.util.Scanner;

class User extends rto {
    User() {
        super();

    }

    public User(String regno, String newRegno, String vehno, String newVehno, String cartype, String newCartype,
            String makers, String newMakers, String yearofman, String newYearofman, String regdate, String newRegdate,
            String expdate, String newExpdate, String renewal, String newrenewal, String owner, String newowner,
            String name, String newname, String address, String newaddress, String age, String newage, String pin,
            String newpin, String gender, String newgender) {
        super(regno, newRegno, vehno, newVehno, cartype, newCartype, makers, newMakers, yearofman, newYearofman,
                regdate,
                newRegdate, expdate, newExpdate, renewal, newrenewal, owner, newowner, name, newname, address,
                newaddress, age,
                newage, pin, newpin, gender, newgender);

    }

    @Override
    public void registration() {
        System.out.println(
                "You are an user you can't register vehicles by your own so please go to your nearby rto to register  your new vehicle");
    }

    @Override
    public void edit() {
        System.out.println(
                "You are an user you can't edit vehicle details by your own so please go to your nearby rto to edit your new vehicle");
    }

    @Override
    public void licence() {
        System.out.println("You are an user you first apply for licence you can't do it by yourself");
    }

    @Override
    public void renewal(String acn) {
        System.out.println("sorry user you can't do it by yourself");
    }

    @Override
    public void transfer(String acn) {
        System.out.println("You have to visit rto and change transfer details");
    }

    public void help() {
        System.out.println("----------------------------------------------------");
        System.out.println("Hello user im there for you what's your problem     |");
        System.out.println("----------------------------------------------------");
        System.out.println("Press 1 if Your problem is About registration       |");
        System.out.println("Press 2 if Your problem is About licence            |");
        System.out.println("Press 3 if Your problem is About renewal            |");
        System.out.println("Press 4 if Your problem is about transfer           |");
        System.out.println("----------------------------------------------------");
        Scanner in = new Scanner(System.in);
        int prob = in.nextInt();
        switch (prob) {
            case 1:
                System.out.println("here you can see registration details ");
                break;
            case 2:
                System.out.println("");
                break;
            case 3:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
                break;
        }
    }
}
