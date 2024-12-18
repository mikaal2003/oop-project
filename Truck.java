import java.time.LocalTime;

public class Truck extends Vehicle{
    private double cargoCapacity;

    public Truck(String vehicleNum, LocalTime entryTime, double cargoCapacity) {
        super(vehicleNum, entryTime);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity(){
        return cargoCapacity;
    }

    @Override
    public String getVehicleType() {
        return "Truck";
    }

    public double calculateFees(long durationInMinutes) {
        double ratePerHour = 100;
        if (durationInMinutes < 60 ){
            durationInMinutes = 60;
        }
        return ((double)durationInMinutes/60) * ratePerHour;
    }
}
