public class Car {
    String color;
    String type;
    int serialNumber;
    static int carCount;

    Car() {
        carCount++;
        serialNumber = carCount;
    }

    Car(String c, String t) {
        color = c;
        type = t;
        carCount++;
        serialNumber = carCount;
    }

    void start() {
        System.out.println("Get Started!");
    }

    public String printDescription() {
        String desc = ("This is a" + color + " " + type);
        return desc;
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "Sedan");
        Car car2 = new Car("blue", "Station Wagon");
        Car car3 = new Car("white", "Coupe");
    }
}
