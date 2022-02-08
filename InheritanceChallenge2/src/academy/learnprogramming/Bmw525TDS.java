package academy.learnprogramming;

public class Bmw525TDS extends Car{

    private int roadServiceMonth;

    public Bmw525TDS(int roadServiceMonth) {
        super("BMW 525 TDS", "2", 5, 5, 5, true);
        this.roadServiceMonth = roadServiceMonth;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;

        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(3);
        } else {
            changeGear(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
