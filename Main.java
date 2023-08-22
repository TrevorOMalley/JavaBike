public class Main {
    public static void main(String[] args) {
        Bike myBike = new Bike("Red", "Medium", Material.ALUMINUM, 26.0);
        System.out.println("Bike color: " + myBike.getColor());
        System.out.println("Bike size: " + myBike.getSize());
        System.out.println("Frame material: " + myBike.getFrameMaterial());
        System.out.println("Wheel size: " + myBike.getWheelSize());
        myBike.start();
        myBike.stop();
    }
}