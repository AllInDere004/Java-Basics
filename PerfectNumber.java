import java.util.Scanner;

class InnerPerfectNumber {
    int i,temp,n,r,sum=0;
    void input(){
        System.out.println("Enter the Number to Check:");
        Scanner a = new Scanner(System.in);
        n=a.nextInt();
        temp=n;
    }
    void output(){
        for(i=1;i<=n/2;i++){
            r=n%i;
            if(r==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println(temp+" is a Perfect Number");
        }
        else{
            System.out.println(temp+" is not a perfect number");
        }
    }
    
}
public class PerfectNumber {
    public static void main(String[] args) {
        InnerPerfectNumber obj=new InnerPerfectNumber();
        obj.input();
        obj.output();
    }
}
