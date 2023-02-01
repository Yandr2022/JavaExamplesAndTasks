package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("car",2,4,130,30);

        Vehicle vehicle1 = new Vehicle("bus");
        vehicle1.setPassengers(45);
        vehicle1.setWheels(4);
        vehicle1.setMaxSpeed(100);
        vehicle1.setBurnUp(25);

        double time = 0.5;
        vehicle.showDistanceByTime(time);
        vehicle1.showDistanceByTime(time);

        time =1.25;
        System.out.println(String.format("%s will carry %d passengers of %.2f km in %.0f minutes, using %.2f liters of fuel"
                , vehicle.getName(), vehicle.getPassengers(),vehicle.getDistanceInTime(time),time * 60, vehicle.getFuelConsumptionByTime(time)));
    }

}
class Vehicle{
    private String name;
    private int passengers;
    private int wheels;
    private int maxSpeed;
    private int burnUp;

    public Vehicle() {
    }

    public Vehicle(String name) {
        this.name = name;
    }

    public Vehicle(String name, int passengers, int wheels, int maxSpeed, int burnUp) {
        this.name = name;
        this.passengers = passengers;
        this.setWheels(wheels);
        this.maxSpeed = maxSpeed;
        this.burnUp = burnUp;
    }
    public Vehicle(Vehicle vehicle) {
        name = vehicle.getName();
        passengers = vehicle.getPassengers();
        wheels = vehicle.getWheels();
        maxSpeed = vehicle.getMaxSpeed();
        burnUp = vehicle.getBurnUp();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if (wheels<1||wheels>24){
            System.out.println("wrong wheels numbers");
            return;
        }
        this.wheels = wheels;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBurnUp() {
        return burnUp;
    }

    public void setBurnUp(int burnUp) {
        this.burnUp = burnUp;
    }

    void showDistanceByTime(double hours) {
        System.out.println(String.format("%s travels %.2f km in %.0f minutes", name, hours * maxSpeed, hours * 60));
    }
    double getDistanceInTime(double hours) {
        return hours * maxSpeed;
    }
    double getFuelConsumptionByTime(double hours) {
    return (getDistanceInTime(hours)/100)* burnUp;
    }
}