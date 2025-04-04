//practical14

class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

    void drift() {
        System.out.println(name + " makes a perfect drift");
    }
}

class BMW extends Car {
    BMW(String name) {
        super(name);
    }

    void speed() {
        System.out.println(name + " top speed 300+ kmph");
    }
}

public class Main {
    public static void main(String[] args) {
        BMW b = new BMW("BMW M5 CS");
        b.drift();
        b.speed();
    }
}