package be.intecbrussel;

public class Car {
    public String color;
    public int amountOfWheels;
    private int amountOfDoors;
    private int amountOfSeats;
    private boolean isElectricity;
    protected int horsePower;
    String model;

    private double speed;

    // Getter methodes: geven properties terug.
    public int getAmountOfDoors() {
        return amountOfDoors;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public double getSpeed() {
        return speed;
    }

    // De conventie bij boolean getter methodes: is + naam van property
    public boolean isElectricity() {
        return isElectricity;
    }

    // Setter methodes: Vul properties in.
    public void setAmountOfSeats(int amountOfSeats) {
        if (amountOfSeats > 0) {
            this.amountOfSeats = amountOfSeats;
        }
    }

    // Functionalities
    public void startCar() {
        System.out.println("The car is starting...");
    }

    public void accelerate(double speedToAdd) {
        if (speedToAdd > 0) {
            this.speed += speedToAdd;
            System.out.println("The car is accelerating...");
        } else {
            System.out.println("The car cannot accelerate negatively or with 0");
        }
    }

    public void slowDown(double speedToDecrease) {
        if (speedToDecrease > 0) {
            this.speed -= speedToDecrease;
        } else {
            this.speed -= -speedToDecrease; // Math.abs(speedToDecrease)
        }

        if (this.speed < 0) {
            this.speed = 0;
        }


        System.out.println("The car is slowing down...");
    }

}

