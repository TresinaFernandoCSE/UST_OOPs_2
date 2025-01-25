
// Hierarchical Inheritance Example
class Animal {
    void eat() {
        System.out.println("Animals eat food.");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        cat.meow();
        
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
