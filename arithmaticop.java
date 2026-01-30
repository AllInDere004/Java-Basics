
public class arithmaticop {
    public static void main(String[] args) {
        int x=10, y=20;
        System.out.println("The sum of the two number is"+(x+y));
        System.out.println("The mul of two number is"+(x*y));
        System.out.println("The division of two numbwe is: "+(y/x));

        int z=(x+y*10);
        System.out.println(z);

        z=x++;
        System.out.println(z+" "+x);

        z=++x;
        System.out.println(z+" "+x);


    }
    
}
