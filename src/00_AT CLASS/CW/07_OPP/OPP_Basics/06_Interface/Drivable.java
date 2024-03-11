package Interface;
interface Drivable {
    void drive();
    void stop();
    void start();

    default void maintenance() {
        System.out.println("Interface one run");
    }
}

interface Chargeable {
    void recharge();
    void checkChargeLevel();

    default void maintenance() {
        System.out.println("Interface two run");
    }
}

interface Fuelable {
    void refuel();
    void checkFuelLevel();

    default void maintenance() {
        System.out.println("Interface two run");
    }
}

class Car implements Drivable, Chargeable, Fuelable {

    @Override
    public void drive() {
        System.out.println("Driving...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping...");
    }

    @Override
    public void start() {
        System.out.println("Starting...");
    }

    @Override
    public void recharge() {
        System.out.println("Recharging...");
    }

    @Override
    public void checkChargeLevel() {
        System.out.println("Checking charge level...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling...");
    }

    @Override
    public void checkFuelLevel() {
        System.out.println("Checking fuel level...");
    }


    @Override
    public void maintenance() {
        Drivable.super.maintenance();
        Chargeable.super.maintenance();
        Fuelable.super.maintenance();
        System.out.println("Performing car-specific maintenance.");
    }
}
