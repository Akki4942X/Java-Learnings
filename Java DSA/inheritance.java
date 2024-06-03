public class inheritance {
    public static void main(String[] args) {
        Dog Pitbull = new Dog();
        Pitbull.eat();
        Pitbull.barks();
    }
}

// parent class/base class
class Animal {
    String Name;

    void breath() {
        System.out.println("Braths");
    }

    void eat() {
        System.out.println("Eats");
    }
}

// Derived class/sub-class
class Dog extends Animal {
    String Brid;

    void barks() {
        System.out.println("Barks");
    }
}
