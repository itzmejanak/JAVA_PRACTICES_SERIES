package src.Week16;

//Week 16 Lab
//1. Create a class BillingSystem (Super Class) with the following
class BillingSystem {
    protected double getDiscount() {
        return 0; // Default discount percentage
    }

    protected void calculateTotal(double subtotal) {
        double discount = getDiscount();
        double total = subtotal - (discount / 100 * subtotal);
        System.out.println("Total: $" + total);
    }
}