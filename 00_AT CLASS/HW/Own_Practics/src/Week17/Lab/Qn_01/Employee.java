package src.Week17.Lab.Qn_01;

import java.util.ArrayList;

public abstract class Employee {
    ArrayList<String> employees = new ArrayList<>();

    public void search(String name){
        if (employees.contains(name)){
            System.out.println(name + " exists in the employee list.");
        }else {
            System.out.println(name + " does not exist in the employee list.");
        }

    }
    public abstract void addName(String name);
    public abstract void removeName(String name);
}
