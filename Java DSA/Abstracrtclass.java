public class Abstracrtclass {
    public static void main(String[] args) {
        Horse h = new Horse();
        kangaroo k = new kangaroo();
        h.eat();
        h.walks();
        k.eat();
        k.walks();
    }

}

abstract class Animal {
    void eat() {
        System.out.println("Eats grass");
    }

    abstract void walks();
}

class Horse extends Animal {
    void walks() {
        System.out.println("Walks on four legs");
    }
}

class kangaroo extends Animal {
    void walks() {
        System.out.println("Walks on two legs");
    }
}
