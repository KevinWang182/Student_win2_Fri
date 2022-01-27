package w3;

public class Vehicle {
    public String make, model;
    public int year;
    protected int odo = 0;
    
    public void drive(int km) {
        odo += km;
    }

    @Override
    public String toString() {
        return "Vehicle{" + "make=" + make + ", model=" + model + ", year=" + year + ", odo=" + odo + '}';
    }
    
}
