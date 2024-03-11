package AT_CLASS.HW.HW_WEEK.Week17.Practices.Week16.Lab;

class MyRestro extends BillingSystem {
    @Override
    protected double getDiscount() {
        return 10; // Discount percentage for restaurant
    }

    void displayFoodItems() {
        System.out.println("Food Items:");
        System.out.println("1. Burger");
        System.out.println("2. Pizza");
        System.out.println("3. Pasta");
    }
}
