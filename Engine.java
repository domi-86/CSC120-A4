public class Engine {


//Attributes
    FuelType f;
    private double currentFuelLevel;
    private double maxFuelLevel;

    public Engine(FuelType f, double maxFuel) {
        this.f = f;
        this.maxFuelLevel = maxFuel;
        this.currentFuelLevel = maxFuel;

    }

//Methods

    public void refuel() {
        this.currentFuelLevel = maxFuelLevel;
    }

    public boolean go() {
        this.currentFuelLevel -= 20;
        System.out.println(this.currentFuelLevel);
        
        return (this.currentFuelLevel > 0);
    }


    // if fuel level is 0, exception
    // reduces ffuel


    public static void main(String[] args) {
        Engine myEngine = new Engine(FuelType.ELECTRIC, 100.0);
        while (myEngine.go()) {
            System.out.println("Choo choo!");
        }
        System.out.println("Out of fuel.");
    }

}