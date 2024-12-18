public class Main {
    public static void main(String[] args) {

        User usr1 = new User("John",1954,2,18);
        Admin usr2 = new Admin("Nicolas", 1964, 1, 7);

        usr1.displayInfo();
        System.out.println();
        usr2.displayInfo();
        System.out.println();
        usr2.displayInfo(true);
        System.out.println();
        usr2.displayInfo(false);



    }
}