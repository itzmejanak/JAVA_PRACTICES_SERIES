package src.Week16;

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
