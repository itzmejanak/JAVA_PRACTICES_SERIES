package AT_CLASS.HW.Own_Practics;

import java.util.Scanner;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] arg){
        ArrayList<User> userlist = new ArrayList<>();
        userlist.add(new User("Rex", "Rex17", "12345"));
        userlist.add(new User("rohan", "roh123", "098765"));

        Scanner scanner = new Scanner(System.in);

        boolean quit = true;
        while (quit){
            System.out.println("What is your Username ?");
            String uName = scanner.nextLine();
            System.out.println("What is your password ?");
            String pwd = scanner.nextLine();

        }
    }
}
