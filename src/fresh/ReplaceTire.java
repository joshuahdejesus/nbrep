package fresh;

//lift car
//replace tire
//lower car
public class ReplaceTire {

    static Car car = new Car();
    static Tire bad = new Tire();
    static Tire good = new Tire();

    static void replaceTire() {

        car.setCarUp(true);
        bad.setTireOut(true);
        good.setTireIn(true);
        car.setCarDown(true);
        car.setCarUp(false);

    }

    public static void main(String[] args) {

        replaceTire();

        if (car.isCarDown() && bad.isTireOut() && good.isTireIn()) {
            System.out.println("tire has been replaced!");

        }
    }
}

class Car {

    boolean carUp;
    boolean carDown;

    public boolean isCarUp() {
        return carUp;
    }

    public void setCarUp(boolean carUp) {
        this.carUp = carUp;
    }

    public boolean isCarDown() {
        return carDown;
    }

    public void setCarDown(boolean carDown) {
        this.carDown = carDown;
    }
}

class Tire {

    boolean tireIn;
    boolean tireOut;

    public boolean isTireIn() {
        return tireIn;
    }

    public void setTireIn(boolean tireIn) {
        this.tireIn = tireIn;
    }

    public boolean isTireOut() {
        return tireOut;
    }

    public void setTireOut(boolean tireOut) {
        this.tireOut = tireOut;
    }
}
