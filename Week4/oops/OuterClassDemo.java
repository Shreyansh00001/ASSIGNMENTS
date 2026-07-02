class Outer {
    void display() {
        System.out.println("Display method inside Outer class.");
    }

    class Inner {
        void display() {
            System.out.println("Display method inside Inner class.");
        }
    }
}

public class OuterClassDemo {
    public static void main(String[] args) {
        System.out.println("Demonstrating Outer and Inner classes:");
        
        Outer outerObj = new Outer();
        outerObj.display();

        Outer.Inner innerObj = outerObj.new Inner();
        innerObj.display();
    }
}
