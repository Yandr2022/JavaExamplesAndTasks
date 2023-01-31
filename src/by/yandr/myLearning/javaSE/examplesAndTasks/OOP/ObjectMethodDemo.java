package by.yandr.myLearning.javaSE.examplesAndTasks.OOP;

public class ObjectMethodDemo {

}
class Vehicle{
    int passengers;
    int wheels;
    int maxSpeed;
    int burnUp;

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
}