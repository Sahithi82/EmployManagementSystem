class GrandParent {
    void grandParentMethod() {
        System.out.println("This is GrandParent class");
    }
}

class Parent extends GrandParent {
    void parentMethod() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is Child class");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();

        obj.grandParentMethod();
        obj.parentMethod();
        obj.childMethod();
    }
}