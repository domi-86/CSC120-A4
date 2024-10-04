import java.util.ArrayList;

public class Car {

    private ArrayList < Passenger > passengersOnboard;
    private final int maxCapacity;


    /**
     * Constructor
     * @param maxCapacity maximum # of passengers in a car
     */
    public Car(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.passengersOnboard = new ArrayList < > (this.maxCapacity);
    }

    /**
     * getCapacity - getter method
     * @return returns maxCapacity
     */
    public int getCapacity() {
        return maxCapacity;
    }

    /**
     * seatsRemaining
     * @return returns # of empty seats
     */
    public int seatsRemaining() {
        return (this.maxCapacity - passengersOnboard.size());
    }

    /**
     * addPassenger
     * @param p Passenger object
     * @return returns true if Passenger is successfully added, false if otherwise
     */
    public boolean addPassenger(Passenger p) {

        //if passenger is in car or car is full, return false; otherwise add passenger and return true
        if (seatsRemaining() == 0 || this.passengersOnboard.contains(p)) {
            return false;
        } else {
            passengersOnboard.add(p);
            return true;
        }

    }

    /**
     * removePassenger
     * @param p Passenger object
     * @return return true if Passenger removed succesfully, false if otherwise
     */
    public boolean removePassenger(Passenger p) {

        //if passenger isn't in car return false; otherwise, remove passenger from car
        if (this.passengersOnboard.contains(p)) {
            this.passengersOnboard.remove(p);
            return true;
        } else {
            return false;
        }

    }

    /** printManifest
     * if Car is empty, prints that it is empty
     * if there are passengers, it prints a list of their names
     */
    public void printManifest() {
        if (seatsRemaining() == this.maxCapacity) {
            System.out.println("This car is EMPTY.");
        } else {
            System.out.println("PASSENGERS:");
            for (Passenger p: passengersOnboard) {
                System.out.println(p.toString());
            }
        }

    }

}