
// Method Overriding Example
class Parent {
    void show() {
        System.out.println("Parent's show method.");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child's overridden show method.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
