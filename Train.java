import java.util.ArrayList;

public class Train {

    private final Engine e;
    private static ArrayList < Car > cars;

    /**
     * Constructor
     * @param f fuelType
     * @param fuelCapacity max fuel
     * @param nCars number of Cars
     * @param passengersCapacity number of passengers in a car
     */
    public Train(FuelType f, double fuelCapacity, int nCars, int passengersCapacity) {
        this.e = new Engine(f, fuelCapacity);
        cars = new ArrayList < > (nCars);

        for (int i = 0; i < nCars; i++) {
            cars.add(new Car(passengersCapacity));
        }

    }

    /**
     * getEngine
     * @return returns Engine
     */
    public Engine getEngine() {
        return this.e;
    }

    /**
     * getCar
     * @param i car in the ArrayList
     * @return returns the Car at index i
     */
    public static Car getCar(int i) {
        return cars.get(i);
    }

    /**
     * getMaxCapacity
     * @return returns max capacity of all cars combined
     */
    public int getMaxCapacity() {
        int max = 0;
        for (Car c: cars) {
            max += c.getCapacity();
        }
        return max;
    }

    /**
     * seatsRemaining
     * @return returns total number of empty seats
     */
    public int seatsRemaining() {
        int seats = 0;
        for (Car c: cars) {
            seats += c.seatsRemaining();
        }
        return seats;
    }

    /**
     * printManifest
     * prints all passengers in every Car
     */
    public void printManifest() {
        for (Car c: cars) {
            c.printManifest();
        }
    }


    public static void main(String[] args) {
        // testing

        Train t = new Train(FuelType.ELECTRIC, 100, 2, 2);
        Passenger p1 = new Passenger("Dominique");
        Passenger p2 = new Passenger("Guillory");
        System.out.println(t.getEngine());
        t.getCar(0).printManifest();
        System.out.println(t.getMaxCapacity());
        System.out.println(t.seatsRemaining());
        p1.boardCar(getCar(0));
        p2.getOffCar(getCar(0));
        p2.boardCar(getCar(0));
        t.printManifest();
        System.out.println(t.seatsRemaining());




    }


}