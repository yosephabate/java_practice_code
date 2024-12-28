package chapter12;

public class ThermUS extends Therm {
    public ThermUS(double celcius) {
        super(celcius);
    }

    public double getTemp() {
        return super.getTemp() * 1.8 + 32;
    }
}

class ThermTest {
    public static void main(String[] args) {
        ThermUS therm = new ThermUS(3.6);
        System.out.println(therm.getTemp());

        Therm therm2 = new Therm(3.6);
        System.out.println(therm2.getTemp());
    }
}
