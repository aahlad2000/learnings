package september_5_2021;

class test {
 void method(){
     System.out.println("This is test");
 }

}

public class Polymorphism extends test {
    void method(){
        System.out.println("This is polymorphism");
    }
}

class Main {
    public static void main(String[] args) {
        test ob = new test();
        Polymorphism ob1 = new Polymorphism();
        test ob3 = new Polymorphism();
        ob.method();
        ob1.method();
        ob3.method();
    }

}
