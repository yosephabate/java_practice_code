package chapter12;

public class Cat extends Animal {
    private int hairballs;

    public Cat(String name, int hairballs) {
        super(name);
        this.hairballs = hairballs;
    }

    public int getHairballs() {
        return hairballs;
    }

    public void speak() {
        System.out.println("Meow!");
    }
}
