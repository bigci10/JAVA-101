import java.util.Scanner;
public class AreaOfCircle {

    public static void main(String[] args) {
        int r;
        double pi=3.14;
        Scanner inp =new Scanner(System.in);

        System.out.println("Enter the radius of a circle: :");
        r =inp.nextInt();
        double circle =pi*r*r;
        double circumference =2*pi*r;

        System.out.println("AreaOfCircle : "+circle);
        System.out.println("Circumference of a Circle : "+circumference);
    }
}
