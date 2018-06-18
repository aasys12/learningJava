public class car1 extends Vehicle{
    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGears;

    public car1(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGears = 1;
    }

    public void changeGears(int currentGears) {
        this.currentGears = currentGears;
        System.out.println(" car.setCurrentgear(): Changed to"+this.currentGears+"gear");
    }
    public void changeVelocity(int speed, int direction){
        System.out.println("Car.changeVelocity() "+speed+" Direction "+direction);
        move(speed,direction);


    }

    @Override
    public void stop() {
        super.stop();
    }
}
