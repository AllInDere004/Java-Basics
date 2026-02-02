import java.util.Scanner;

    
class Even_Odd {
    int n=5;
    void show1(){
        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
class Pos_Neg {
    int n=-10;
    void show2(){
        if(n>0){
            System.out.println("Positive");
        }
        else if(n==0){
            System.out.println("It is Zero");
        }
        else{
            System.out.println("Negative");
        }        
    }
}
public class EveOdd_PosNeg {
    public static void main(String[] args) {
            


        Even_Odd obj1 =new Even_Odd();
        Pos_Neg obj2 =new Pos_Neg();
        obj1.show1();
        obj2.show2();
            
    }
       
}
    

