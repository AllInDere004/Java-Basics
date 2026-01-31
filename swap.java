class swap {
    int a,b;
    
    swap(){
        a=5;b=10;
    }

    void logic(){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    void output(){
        System.out.println("a: "+a+" "+"b: "+b);
    }
    public static void main(String[] args) {
        swap ob = new swap();
        ob.logic();
        ob.output();
    }
}
