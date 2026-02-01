public class Factorial {
    
    int show(int n){
         if(n==0 || n==1){
            return 1;
         }
         return n*show(n-1);
    }
    public static void main(String[] args) {
        System.out.println("The Factorial of the number is given below: ");
        Factorial obj=new Factorial();
        int result=obj.show(5);
        System.out.println(result);
    }
}
