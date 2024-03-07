package oops;

public class inheri {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
        shark.breathe();
        shark.Swim();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathe");
    }
}

class Fish extends Animal {
    int fins;

    void Swim() {
        System.out.println("Swims");
    }
}
