package com.company.automobile;

public class Main {

    public static void main(String[] args) {
        Car vehicle = new Car();
        vehicle.setColor("Red");
        vehicle.setMake("Ford");
        vehicle.setModel("GTO");
        vehicle.setName("Betsy");
        vehicle.setYear(1967);

        System.out.println("I just bought a " + vehicle.getMake() + " " + vehicle.getModel());

    }
}
