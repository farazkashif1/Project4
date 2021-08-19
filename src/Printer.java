class RealPrinter {
    // the "delegate"
    void print()
    {
        System.out.println("The Delegate");
    }
}

public class Printer {
    // the "delegator"
    RealPrinter p = new RealPrinter();

    // create the delegate
    void print()
    {
        p.print(); // delegation
    }
}

