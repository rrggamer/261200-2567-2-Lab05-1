import java.time.LocalDate;

public class Admin extends User {

    //Constructor
    public Admin() {
        super();
    }

    public Admin(String name, int year, int month, int day) {
        super(name, year, month, day);
    }


    //OverRide

    public void displayInfo() {
        super.displayInfo();
        System.out.println("User type: Admin");
    }

    //OverLoading

    public void displayInfo(boolean full) {
        if (full) {
            displayInfo();
            System.out.println("Today's Date: " + LocalDate.now());
        } else {
            System.out.println("Admin Name: " + getName());
        }
    }

}
