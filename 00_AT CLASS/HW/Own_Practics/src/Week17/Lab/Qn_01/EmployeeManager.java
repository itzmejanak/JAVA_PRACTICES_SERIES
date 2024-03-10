package src.Week17.Lab;
import java.util.Scanner;

public class EmployeeManager extends Employee{
    @Override
    public void addName(String name) {
        if (employees.contains(name)){
            System.out.println(name + " This name already exists in the employee list.");
        }else {
            employees.add(name);
            System.out.println(name + " added successfully.");
        }
    }

    @Override
    public void removeName(String name) {
        if (employees.contains(name)){
            employees.remove(name);
            System.out.println(name + " removed successfully.");
        }else {
            System.out.println(name + " does not exist in the employee list.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();

        int times = 5;
        while(0 <= times){
            System.out.println("Please add name you added only: "+ times+" times");
            String names = scanner.nextLine();
            employeeManager.addName(names);
            times--;
        }

        System.out.println("Enter a name to search:");
        String searchName = scanner.nextLine();
        employeeManager.search(searchName);

        System.out.println("Enter two names to remove:");
        String name1 = scanner.nextLine();
        String name2 = scanner.nextLine();
        employeeManager.removeName(name1);
        employeeManager.removeName(name2);

        scanner.close();
    }
}
