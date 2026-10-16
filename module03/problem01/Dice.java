package module03.problem01;

import java.util.Random;

public class Dice {
    private int number;

    public Dice() {
        this.number = this.rollNumber();
    }

    private int rollNumber() {
        Random rand = new Random();
        return rand.nextInt(6) + 1;
    }

    public int getNumber() {
        return number;
    }
}