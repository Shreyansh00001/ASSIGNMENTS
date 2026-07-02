interface test {
    int square(int x);
}

class arithmetic implements test {
    @Override
    public int square(int x) {
        return x * x;
    }
}

public class ToTestInt {
    public static void main(String[] args) {
        arithmetic obj = new arithmetic();
        int value = 5;
        System.out.println("Testing interface 'test' implemented by class 'arithmetic':");
        System.out.println("Square of " + value + " is: " + obj.square(value));
    }
}
