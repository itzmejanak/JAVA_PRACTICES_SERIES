package AT_CLASS.CW.$07_OPP.OPP_Basics.$00_Test;
import java.util.ArrayList;
public class Homework {
    public static void main(String[] args) {
        ArrayList<String> members = new ArrayList<>();

        members.add("Nischay");
        members.add("Manoj");
        members.add("Samir");
        members.add("Misma");
        members.add("Shishir");
        members.add("Rabin");

        members.add(3, "Sazeen");
        members.add(4, "Bibash");

        members.add("Saurav");
        members.add("Biraj");

        members.remove(7);

        members.remove("Manoj");
        members.remove("manoj");
        members.remove("MANOJ");

        members.set(4, "Cevin");

        members.set(0, "Manoj");

        int indexOfBishesh = members.indexOf("Bishesh");
        boolean containsBishesh = members.contains("Bishesh");
        int indexOfCevin = members.indexOf("Cevin");
        boolean containsCevin = members.contains("Cevin");

        System.out.println("Modified List:");
        for (String member : members) {
            System.out.println(member);
        }

        System.out.println("\nSearch Results:");
        System.out.println("Index of Bishesh: " + indexOfBishesh);
        System.out.println("Contains Bishesh: " + containsBishesh);
        System.out.println("Index of Cevin: " + indexOfCevin);
        System.out.println("Contains Cevin: " + containsCevin);
    }
}
