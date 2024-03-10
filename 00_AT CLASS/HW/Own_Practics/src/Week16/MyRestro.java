package src;

public class MyRestro extends BillingSystem{
    @Override
    public int getDiscount() {
        return 15;
    }

    public void displayFoodItems(){
        System.out.println("Available Food Items:");
        System.out.println("1. Pizza");
        System.out.println("2. Burger");
        System.out.println("3. Pasta");
        System.out.println("4. Coffee");
        System.out.println("5. Sandwich");
    }
//    public static void main(String[] args) {
//        MyRestro myRestro = new MyRestro();
//        myRestro.displayFoodItems();
//        myRestro.calculateTotal();
//    }
}
