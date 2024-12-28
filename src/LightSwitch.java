class LightSwitch {
    private int on = 1;

    public boolean isOn() {
        return on == 1;
    }

    public void switchLight() {
        on = 1 - on;
    }
}

class TestLightSwitch {
    public static void main(String[] args) {
        LightSwitch ls = new LightSwitch();

        if (ls.isOn())
            System.out.println("Light is on!");
        else
            System.out.println("Light is off!");
    }
}