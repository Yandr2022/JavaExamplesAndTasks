package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class ObjectMethodDemo {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("car", 2, 4, 130, 30);
        Vehicle vehicle1 = new Vehicle("bus");
        vehicle1.setPassengers(45);
        vehicle1.setWheels(-2);
        vehicle1.setMaxSpeed(100);
        vehicle1.setBurnUp(25);
        Vehicle vehicle2 = new Vehicle();
        Vehicle[] vehicles = {vehicle, vehicle1, vehicle2};
        double time = 0.5;
        for (Vehicle veh : vehicles) {
            System.out.println(veh.toString());
            veh.showDistanceByTime(time);
        }
        System.out.println();
        int hours =2;
        for (Vehicle veh : vehicles) {
            System.out.println(String.format("%s will carry %d passengers of %.2f km in %d minutes, using %.2f liters of fuel"
                    , veh.getName(), veh.getPassengers(), veh.getDistanceInTime(hours), hours * 60
                    , veh.getFuelConsumptionByTime(time)));
        }
        System.out.println();
        Auto[] autos = {new Auto(true),new Auto(),new Auto("bmw",2,4,250,30,true)
                , new Auto(vehicle1,false)};
        for (Auto auto : autos) {
            System.out.println(auto);
            System.out.println(String.format("%s %s sunroof, will carry %d passengers " +
                            "of %.2f km in %d minutes, using %.2f liters of fuel"
                    , auto.getName(), ((auto.isSunroof()) ? "with" : "without"), auto.getPassengers()
                    , auto.getDistanceInTime(hours), hours * 60, auto.getFuelConsumptionByTime(hours)));
        }
        System.out.println();
        vehicles[1] = autos[2];
        vehicles[2] = new Moto();
        for (Vehicle veh : vehicles) {
            System.out.println(veh);
//            System.out.println(veh.isSunRoof());class Vehicle (ref type) does not have this method
            if (veh instanceof Moveable){
                ((Moveable) veh).move(12,35);
            }
        }

    }

}
interface Moveable{
    int GAP =1;
    void move(int left,int top);
}
class Moto extends Vehicle implements Moveable{
    public Moto() {
        this("moto",2,2,200,10);
    }

    public Moto(String name, int passengers, int wheels, int maxSpeed, int burnUp) {
        super(name, passengers, wheels, maxSpeed, burnUp);
    }

    public Moto(Vehicle vehicle) {
        super(vehicle);
    }

    @Override
    public void move(int left, int top) {
        System.out.println("move to " + left + ", " + top);
    }
}
class Auto extends Vehicle implements Moveable {
    private boolean sunroof;

    public Auto() {
        this("auto", 4, 4, 160, 13, false);
    }

    public Auto(boolean sunroof) {
        this("auto", 4, 4, 160, 13, sunroof);
    }

    public Auto(String name, int passengers, int wheels, int maxSpeed, int burnUp, boolean sunroof) {
        super(name, passengers, wheels, maxSpeed, burnUp);
        this.sunroof = sunroof;
    }

    public Auto(Vehicle vehicle, boolean sunroof) {
        super(vehicle);
        this.sunroof = sunroof;
    }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
        return super.toString() + ", sunroof= " + sunroof;
    }

    @Override
    public void move(int left, int top) {
        System.out.println("move to " + left + ", " + top);
    }
}
class Vehicle{
    private String name;
    private int passengers;
    private int wheels;
    private int maxSpeed;
    private int burnUp;

    public Vehicle() {
        this("vehicle",4,4,160,13);
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
        if (wheels < 1 || wheels > 24) {
            System.out.println(name+" :wrong wheels numbers");
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

    double getDistanceInTime(int hours) {
        return getDistanceInTime((double) hours);
    }

    double getFuelConsumptionByTime(double hours) {
        return (getDistanceInTime(hours) / 100) * burnUp;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+": name='" + name +
                ", passengers=" + passengers +
                ", wheels=" + wheels +
                ", maxSpeed=" + maxSpeed +
                ", burnUp=" + burnUp ;
    }
}