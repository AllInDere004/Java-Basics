import java.util.Scanner;

public class logicalop {
    public static void main(String[] args) {
        String user="Soumalya",password="Dere";
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String iuser = scn.nextLine();
        System.out.print("Enter your password: ");
        String ipass = scn.nextLine();

        if (user.equals(iuser)&&password.equals(ipass)) {
                System.out.println("Welcome");
        }
        else{
            System.out.println("Try Again");
        }
        scn.close();

        boolean x=true, y=false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT

             int a = 10, b = 5, c;
        a += b;
        System.out.println(a);
        a %= b;
        System.out.println(a);
        c = a = b;
        System.out.println(c);
    }
}
