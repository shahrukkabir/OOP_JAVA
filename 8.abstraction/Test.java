// Interfaces support multiple inheritance.

interface A {
    void play();
}

interface B {
    void stop();
}

// Class C implements both A and B interfaces
class C implements A, B {
    public void play() {  // Implementing method from interface A
        System.out.println("Playing");
    }
    
    public void stop() {  // Implementing method from interface B
        System.out.pri+ntln("Stopping");
    }
}

public class Test {
    public static void main(String[] args) {
        C obj = new C();
        obj.play();   // Calling play() from A
        obj.stop();   // Calling stop() from B
    }
}
