package AT_CLASS.HW.HW_WEEK.Week17.Practices.Week16.Lab;

class MyCafe extends BillingSystem {
    @Override
    protected double getDiscount() {
        return 5; // Discount percentage for cafe
    }

    void displayCoffeeItems() {
        System.out.println("Coffee Items:");
        System.out.println("1. Espresso");
        System.out.println("2. Latte");
        System.out.println("3. Cappuccino");
    }
}
