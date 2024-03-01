import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    ArrayList<User> userList  = new ArrayList<>();

    userList.add(new User("Janak", "Rex17", "rex1234"));
    userList.add(new User("John Doe", "john123", "password123"));

    
}

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
