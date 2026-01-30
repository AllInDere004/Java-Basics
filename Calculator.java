import java.util.Scanner;
public class Calculator {
    int a,b,c,d,e,f;
    Calculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Enter Second number: ");
        b=sc.nextInt();
        sc.close();
    }
    void logic(){
         c=a+b;
         d=a-b;
         e=a*b;
         f=a/b;
    }

    void display(){
        System.out.println("Addition: "+c+" "+"Sub: "+d+" "+"Mul: "+e+" "+"Div: "+f);
    }
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        obj1.logic();
        obj1.display();
        
    }
    
}
