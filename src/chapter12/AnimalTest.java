package chapter12;

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog("Rover", 3);
        Cat c = new Cat("Kitty", 2);

        System.out.println(d.getName() + " has " + d.getFleas() + " fleas.");
        System.out.println(c.getName() + " has " + c.getHairballs() + " hairballs.");
    }
}
