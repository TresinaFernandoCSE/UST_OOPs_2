
// Super and This Keyword Example
class Parent {
    String name = "Parent";
    
    void display() {
        System.out.println("This is Parent class.");
    }
}

class Child extends Parent {
    String name = "Child";
    
    void show() {
        System.out.println("Child name: " + this.name);
        System.out.println("Parent name: " + super.name);
        super.display();
    }
}

public class SuperAndThisExample {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
