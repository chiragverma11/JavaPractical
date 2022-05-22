class Abc {
    int number = 0;

    Abc() { // Default Constructor
        System.out.println("This is Default Constructor.");
    }

    Abc(int n)// Parameterized Constructor
    {
        System.out.println("This is Parameterized Constructor.");
        number = n;
    }

    Abc(Abc C)// Copy Constructor
    {
        System.out.println("This is Copy Constructor.");
        number = C.number;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Abc obj1 = new Abc();
        System.out.println(obj1.number);
        Abc obj2 = new Abc(25);
        System.out.println(obj2.number);
        Abc obj3 = new Abc(obj2);
        System.out.println(obj3.number);
    }

}
