class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int a) {
        System.out.println("I am an overloaded constructor with value of a as: " + a);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        super(0);
        System.out.println("I am a derived class constructor");
    }
}

public class inherit1 {
    public static void main(String[] args) {
        Derived1 d = new Derived1();
    }
}