//practical19

interface Speaker {
    void speak();
}

interface Walker {
    void walk();
}

interface Worker {
    void work();
}

class Robot implements Speaker, Walker, Worker {
    public void speak() {
        System.out.println("Robot is speaking");
    }

    public void walk() {
        System.out.println("Robot is walking");
    }

    public void work() {
        System.out.println("Robot is working");
    }
}

public class Main {
    public static void main(String[] args) {
        Robot robo = new Robot();
        robo.speak();
        robo.walk();
        robo.work();
    }
}