class Inox {        //Sub class
    void m1(){
        System.out.println("K.G.F.");
    }
    void m2(){
        System.out.println("PUSHPA 2: THE RULE");
    }
    void m3(){
        System.out.println("BAHUBALI 2: THE CONCLUSION");
    }
    
}
public class TicketCounter {
    public static void main(String[] args) {        // Main class 
        Inox obj = new Inox();
        obj.m1();               // Call or access m1
        obj.m2();
        obj.m3();
    }
}
