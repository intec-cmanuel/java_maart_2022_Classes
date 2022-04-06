package be.intecbrussel;

public class CarApp {
    public static void main(String[] args) {

        Car smallCar = new Car();
        Car toufikMobile = new Car();
        Car opel = new Car();

        smallCar.color = "red";
        smallCar.amountOfWheels = 4;

        toufikMobile.color = "black";
        toufikMobile.amountOfWheels = 2;

        opel.color = "Light Blue or just regular blue";
        opel.amountOfWheels = 12;

        Car[] arrayOfCars = new Car[]{smallCar, toufikMobile, opel};

//        for (Car car : arrayOfCars) {
//            car.setAmountOfSeats(-5);
//        }
//
//        for (Car car : arrayOfCars) {
//            System.out.println(car.getAmountOfSeats());
//        }

        toufikMobile.startCar();
        System.out.println("Speed: " + toufikMobile.getSpeed() + "fasts per second");
        toufikMobile.accelerate(20);
        System.out.println("Speed: " + toufikMobile.getSpeed() + "fasts per second");
        toufikMobile.accelerate(45);
        System.out.println("Speed: " + toufikMobile.getSpeed() + "fasts per second");
        System.out.println("Toufik arrived at intec");
        toufikMobile.slowDown(100);
        System.out.println("Speed: " + toufikMobile.getSpeed() + "fasts per second");











//        System.out.println(smallCar.color);
//        System.out.println(toufikMobile.color);
//
//        System.out.println(smallCar.amountOfWheels);
//        System.out.println(toufikMobile.amountOfWheels);

    }
}
