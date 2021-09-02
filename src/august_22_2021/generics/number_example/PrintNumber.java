package august_22_2021.generics.number_example;

public class PrintNumber {

    public <T extends Number> void printNumber(T a) {
        System.out.println(a);
    }

    public <ASD> void printObject(ASD a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        printNumber.printNumber(5.6);
    }

}
