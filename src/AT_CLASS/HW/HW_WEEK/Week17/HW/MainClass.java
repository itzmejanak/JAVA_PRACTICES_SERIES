package AT_CLASS.HW.HW_WEEK.Week17.HW;
import java.util.ArrayList;
import java.util.Scanner;

class User {
    private String name;
    private String username;
    private String password;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}

public class MainClass {
    public static void main(String[] args) {
        ArrayList<User> userList = new ArrayList<>();
        
        
        userList.add(new User("Janak", "Rex17", "rex1234"));
        userList.add(new User("John Doe", "john123", "password123"));


        Scanner scanner = new Scanner(System.in);
        boolean quiet = true;

        while (quiet) {
            System.out.println("What is your Username? ");
            String askedName = scanner.nextLine();

            System.out.println("What is your Password? "); 
            String askedPwd = scanner.nextLine();

            boolean userExists = false;

            for (User user : userList) {
                if (user.getUsername().equals(askedName)) {
                    userExists = true;
                    if (user.getPassword().equals(askedPwd)) {
                        System.out.println("Hello " + user.getName());
                        quiet = false;
                    } else {
                        System.out.println("Your credentials are wrong");
                    }
                }
            }

            if (!userExists) {
                System.out.println("User does not exist. Do you want to register (yes/no)? ");
                String choice = scanner.nextLine();
                if (choice.equals("yes")) {
                    System.out.println("What is your name ? ");
                    String newName = scanner.nextLine();
                    System.out.println("What do you want to set your Username ? ");
                    String newUsername = scanner.nextLine();
                    System.out.println("Enter your password ? ");
                    String newPassword = scanner.nextLine();


                    userList.add(new User(newName, newUsername, newPassword));
                    System.out.println("Thank you for your registration ");


                } else {
                    System.out.println("Do you want to register again ? ");
                    String answer = scanner.nextLine();
                    if (answer.equals("no")) {
                        quiet = true;
                    }
                }
            }
        }
        scanner.close();
    }
}

