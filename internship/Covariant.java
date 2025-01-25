class A {
    A  display() {
        System.out.println("Class A display");
    return this;
    }
}

class B extends A {
    @Override
    B display() {  
        System.out.println("Class B display");
     return this;   
    }
}

public class Covariant
 {
    public static void main(String[] args) {
        A objA = new A();
        A objB = new B();

        objA.display();  // Calling display on A instance
        objB.display();  
    }
}
