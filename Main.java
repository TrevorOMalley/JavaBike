public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike("Red", "Medium", Material.ALUMINUM, 26.0);
        Bike myBike2 = new Bike("Yellow", "Small", Material.Ti, 29.0);
        Bike myBike3 = new Bike("Blue", "Medium", Material.STEEL, 27.5);
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