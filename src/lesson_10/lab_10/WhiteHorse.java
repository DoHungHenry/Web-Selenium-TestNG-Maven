package lesson_10.lab_10;

import java.security.SecureRandom;

public class WhiteHorse extends Horse {

    private final int WHITE_HORSE_MAX_SPEED = 100;
    private int whiteHorseSpeed;
    private String name;

    public WhiteHorse(String name) {
        this.name = name;
        this.whiteHorseSpeed = new SecureRandom().nextInt(WHITE_HORSE_MAX_SPEED);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSpeed() {
        return this.whiteHorseSpeed;
    }

    @Override
    public String toString() {
        return "WhiteHorse{" +
                "whiteHorseSpeed=" + whiteHorseSpeed +
                ", name='" + name + '\'' +
                '}';
    }
}
