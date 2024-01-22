/**

 * Project: Lab 1
 * Purpose Details: Motorcycle
 * Course: IST 242
 * Author: Joe Oakes
 * Date Developed:
 * Last Date Changed:
 * Rev:

 */

// Bike class
class Bike {
    /**
     * The color of the bike
     */
    private String color;
    /**
     * The size of the bike
     */
    private double size;
    private Frame frame;
    private Wheel[] wheels;


    /**
     * Adds two numbers and returns the result.
     *
     * @param color This is the color of the bike frame.
     * @param size This is the size of the bike frame.
     */
    public Bike(String color, double size, Material frameMaterial, double wheelSize) {
        this.color = color;
        this.size = size;
        this.frame = new Frame(frameMaterial);
        this.wheels = new Wheel[2];
        this.wheels[0] = new Wheel(wheelSize);
        this.wheels[1] = new Wheel(wheelSize);
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getSize(){
        return size;
    }

    public void setSize(double size){
        this.size = size;
    }

    public Material getFrameMaterial(){
        return frame.getMaterial();
    }

    public double getWheelSize(){
        return wheels[0].getSize();
    }

    public void start() {
        System.out.println("Bike started!");
    }
    public void stop() {
        System.out.println("Bike stopped.");
    }
}
