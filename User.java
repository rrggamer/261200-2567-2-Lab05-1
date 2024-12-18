import java.time.LocalDate;

public class User {

    private String name;
    private LocalDate dob;

    //Constructor
    public User(){
        this.name = null;
        this.dob = LocalDate.now();

    }

    public User(String name, int year, int month, int day){
        setName(name);
        setDob(year, month, day);
    }

    //Getter

    public String getName() {
        return name;
    }

    public LocalDate getDob(){
        return dob;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    public void setDob(int year, int month, int day){
        this.dob = LocalDate.of(year,month,day);

    }

    //Method

    public void displayInfo(){
        System.out.println("Name : " + getName());
        System.out.println("Date of Birth : " + getDob());
    }
}
