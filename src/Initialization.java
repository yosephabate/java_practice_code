public class Initialization {
    static {
        System.out.println("Static initialization");
    }

    public Initialization() {
        System.out.println("Constructor initialization");
    }

    public static void main(String[] args) {
        //new Initialization();
    }
}
