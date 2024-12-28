package race;

import java.awt.*;

public class Racecar {
    private String name;
    private Color color;
    private static final double TOP_SPEED = 200.0;

    public Racecar(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public Color getColor() {
        return color;
    }

    public static Racecar race(Racecar car1, Racecar car2) {
        double speed1 = Math.random() * TOP_SPEED;
        double speed2 = Math.random() * TOP_SPEED;

        if (speed1 > speed2) {
            return car1;
        } else if (speed1 < speed2) {
            return car2;
        }

        return null;
    }

    public static void main(String[] args) {
        Racecar car1 = new Racecar("Vitz", Color.RED);
        Racecar car2 = new Racecar("Yaris", Color.RED);
        Racecar winner = Racecar.race(car1, car2);

        if (winner == null) {
            System.out.println("It is a tie!");
        } else {
            System.out.println(winner.getName());
        }
    }
}
