public class Car {

    //attributes
    ArrayList<Passenger> passengersOnboard;
    private int maxCapacity;

    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList<Passenger>(maxCapacity);
    }

    public int getCapacity() {
        return maxCapacity;
    }

    public int seatsRemaining() {
        return (getCapacity()-passengersOnboard.size());
    }


    //addPassenger()

    public addPassenger(Passenger p) {
        
    }
    //remove passenger()
    //printmanifest()

}