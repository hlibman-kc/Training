public class Car {
    String color;
    String type;

    Car(String c, String t) {
        color = c;
        type = t;
    }

    Car() {}

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
