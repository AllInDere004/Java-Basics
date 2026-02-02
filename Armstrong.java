import java.util.Scanner;

class InnerArmstrong {
    int n,temp,i,r,sum=0;
    void input(){
        System.out.println("Enter the number to check: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        temp=n;
    }
    void output(){
        for(i=1;i>0;i++){
            r=n%10;
            sum=sum+(r*r*r);
            n=n/10;
        }
        if(temp==sum){
            System.out.println(temp+" is an Armstrong Number");
        }
        else{
            System.out.println(temp+" is not an Armstrong Number");
        }
    }
    
}
public class Armstrong {
    public static void main(String[] args) {
        InnerArmstrong obj=new InnerArmstrong();
        obj.input();
        obj.output();
    }
}
