class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }

    Base1(int x) {
        System.out.println("I am an overloaded constructor with value of x as: " + x);
    }
}

class Derived1 extends Base1 {
    Derived1() {
        // super(0);
        System.out.println("I am a derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am an overloaded constructor of Derived with value of y as:" + y);
    }
}

public class inherit2 {
    public static void main(String[] args) {
        Derived1 d = new Derived1(14, 9);
    }
}