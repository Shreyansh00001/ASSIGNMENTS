import java.util.Random;

abstract class Compartment {
    public abstract String notice();
}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "First Class: Premium seating. Please maintain quiet.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "Ladies Compartment: Reserved strictly for female passengers.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "General Compartment: Open seating for unreserved ticket holders.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "Luggage Van: Only heavy baggage and parcels permitted here.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] train = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < train.length; i++) {
            int type = random.nextInt(4) + 1; 

            switch (type) {
                case 1:
                    train[i] = new FirstClass();
                    break;
                case 2:
                    train[i] = new Ladies();
                    break;
                case 3:
                    train[i] = new General();
                    break;
                case 4:
                    train[i] = new Luggage();
                    break;
            }
        }

        for (int i = 0; i < train.length; i++) {
            System.out.println("Compartment " + (i + 1) + ": " + train[i].notice());
        }
    }
}