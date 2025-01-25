
// Multilevel Inheritance Example
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("Mammals walk on legs.");
    }
}

class Human extends Mammal {
    void speak() {
        System.out.println("Humans can speak.");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.walk();
        human.speak();
    }
}
