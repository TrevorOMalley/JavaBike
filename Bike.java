// Bike class
class Bike {
    private String color;
    private String size;
    private Frame frame;
    private Wheel[] wheels;
    public Bike(String color, String size, Material frameMaterial, double wheelSize) {
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

    public String getSize(){
        return size;
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
