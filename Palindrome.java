import java.util.Scanner;

class A{
    int n,i,temp,r,sum=0;
    void input(){
        System.out.println("Enter the number to check: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
    }
    void output(){
        for(i=0;i<n;i++){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+ " is a Palindrome number");
        }
        else{
            System.out.println(temp+ " is not a Palindrome Number");
        }
    }
    
}
public class Palindrome {
    public static void main(String[] args) {
        A obj=new A();
        obj.input();
        obj.output();
    }
}
