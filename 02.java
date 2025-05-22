public class Vehicle {
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

    public Vehicle(String licensePlate, String ownerName, int hoursParked) {
        this.licensePlate = licensePlate;
        this.ownerName = ownerName;
        this.hoursParked = hoursParked;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getHoursParked() {
        return hoursParked;
    }

    public void setHoursParked(int hoursParked) {
        this.hoursParked = hoursParked;
    }

    public String toString() {
        return "License Plate: " + licensePlate + ", Owner: " + ownerName + ", Hours Parked: " + hoursParked;
    }
}

public class ParkingLot {
    private Vehicle[] vehicles;
    private int vehicleCount;

    public ParkingLot() {
        vehicles = new Vehicle[5];
        vehicleCount = 0;
    }
}

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = new ParkingLot();

        Vehicle v1 = new Vehicle("ABC123", "John Doe", 2);
        Vehicle v2 = new Vehicle("XYZ789", "Jane Smith", 4);
        Vehicle v3 = new Vehicle("LMN456", "Bob Brown", 1);
    }
}
