/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Joe Oakes
 * Date Developed:
 * Last Date Changed:
 * Rev:

 */

public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike("Red", 55.5, Material.ALUMINUM, 26.0);
        myBike.setColor("Orange");
        myBike.setSize(31.0);
        Bike myBike2 = new Bike("Yellow", 57.0, Material.Ti, 29.0);
        myBike2.setColor("Orange");
        Bike myBike3 = new Bike("Blue", 88.0, Material.STEEL, 27.5);
        System.out.println("Bike color: " + myBike.getColor());
        System.out.println("Bike size: " + myBike.getSize());
        System.out.println("Frame material: " + myBike.getFrameMaterial());
        System.out.println("Wheel size: " + myBike.getWheelSize());
        myBike.start();
        myBike.stop();

        System.out.println("Bike color: " + myBike2.getColor());
        System.out.println("Bike size: " + myBike2.getSize());
        System.out.println("Frame material: " + myBike2.getFrameMaterial());
        System.out.println("Wheel size: " + myBike2.getWheelSize());
        myBike2.start();
        myBike2.stop();

        System.out.println("Bike color: " + myBike3.getColor());
        System.out.println("Bike size: " + myBike3.getSize());
        System.out.println("Frame material: " + myBike3.getFrameMaterial());
        System.out.println("Wheel size: " + myBike3.getWheelSize());
        myBike3.start();
        myBike3.stop();
    }
}