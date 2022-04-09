import java.util.Scanner;
public class AreOfTriangle {
    public static void main(String[] args) {
        
        int a,b,c;
        double u,area;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter first side :");
        a = inp.nextInt();
        System.out.print("Enter second side :");
        b = inp.nextInt();
        System.out.print("Enter third side :");
        c = inp.nextInt();

        u= (a+b+c)/2;
        area=Math.sqrt(u*(u-a)*(u-b)*(u-c));

        System.out.println("Area Of Triangle :" +area);

    }
}
