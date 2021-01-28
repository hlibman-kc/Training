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
        Car myCar = new Car("Dark Gray", "BMW");
        myCar.printDescription();
    }
}
