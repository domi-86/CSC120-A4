public class Engine {

    FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    /**
     * Constructor
     * @param f fuel type
     * @param maxFuel maximum fuel in engine
     */
    public Engine(FuelType f, double maxFuel) {
        this.f = f;
        this.maxFuelLevel = maxFuel;
        this.currentFuelLevel = maxFuel;

    }


    /**
     * refuel
     * resets fuel level to maximum
     */
    public void refuel() {
        this.currentFuelLevel = maxFuelLevel;
    }

    /**
     * go - train moves and reduces fuel
     * @return returns a boolean if the fuel level is empty or not
     */
    public boolean go() {
        this.currentFuelLevel -= 20;
        System.out.println(this.currentFuelLevel);

        return (this.currentFuelLevel > 0);
    }



    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");


    }

}