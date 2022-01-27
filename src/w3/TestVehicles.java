package w3;

public class TestVehicles {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.make = "Honda";
        myCar.model = "Civic";
        myCar.year = 2000;
        myCar.color = "red";
        myCar.passengers = 5;
        myCar.drive(100);
        
        Truck myTruck = new Truck();
        myTruck.make = "Freightliner";
        myTruck.model = "Columbia";
        myTruck.year = 2004;
        myTruck.capacity = 10;
        myTruck.drive(50);
    }
    
}
