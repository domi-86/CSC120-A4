public class Passenger {

    private String name;

    /**
     * Constructor
     * @param name name of Passenger
     */
    public Passenger(String name) {
        this.name = name;
    }

    /**
     * boardCar - checks if it is possible for a Passenger to board, if true then puts Passenger in a Car
     * @param c Car object
     */
    public void boardCar(Car c) {
        if (c.addPassenger(this) == true) {
            c.addPassenger(this);
        }

    }

    /**
     * getOffCar - checks if a Passenger is able to get out of the Car, then removes Passenger from the Car
     * @param c Car object
     */
    public void getOffCar(Car c) {
        if (c.removePassenger(this) == true) {
            c.removePassenger(this);
        }
    }

    /** 
     * toString - returns Passenger's name
     */
    public String toString() {
        return this.name;
    }


}