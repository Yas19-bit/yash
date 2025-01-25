// Online Java Compiler
// Use this editor to write, compile and run your Java code online

abstract class animal{
    abstract void sound();
    
    void eat()
    {
        System.out.println("animal is eating");
        
    }
    
}
class dog extends animal{
    void sound()
    {
        System.out.println("bhow");
    }
}

class Main {
    public static void main(String[] args) {
        dog dog=new dog();
        dog.sound();
    }
}