import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        int math,   phys,  chem, turkish, music;

        double average = 0;
        int lessons = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Grades between 0 and 100 will be added to the average. !");

        System.out.println("Mathematics : ");
        math = input.nextInt();

        System.out.println("Physics : ");
        phys = input.nextInt();

        System.out.println("Chemistry :  ");
        chem = input.nextInt();


        System.out.println("Turkish :  ");
        turkish = input.nextInt();


        System.out.println("Music :");
        music = input.nextInt();


        if ((math >= 0 && math <= 100)) {
            average += math;
            lessons++;
        }

        if ((phys >= 0 && phys <= 100)) {
            average += phys;
            lessons++;
        }

        if ((music >= 0 && music <= 100)) {
            average += music;
            lessons++;
        }

        if ((chem >= 0 && chem <= 100)) {
            average += chem;
            lessons++;
        }

        if ((turkish >= 0 && turkish <= 100)) {
            average += turkish;
            lessons++;
        }



        System.out.println((average/lessons) > 55 ? "Your Passed" : "Your failed the class");
    }

}
