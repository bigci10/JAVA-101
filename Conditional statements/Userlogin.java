import java.util.Scanner;


public class UserLogin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String username , password , answer , user , pass , newpass;

        user = "bigci10";
        pass = "123456";


        System.out.println("-----------Welcome--------------");

        System.out.println("Username :");
        username = s.nextLine();

        System.out.println("Password :");
        password = s.nextLine();


        if ((username == user) && (password == pass)){
            System.out.println("Welcome "+user);
                }
        else{
            System.out.println("Wrong Password");
            System.out.println("Reset Password(Y/N)");
            answer = s.nextLine();
            if(answer.equals("Y") || answer.equals("y")) {

                System.out.println("New Password :");
                newpass = s.nextLine();

                if ((pass != newpass) && (password != newpass)){
                    System.out.println("New password is created.");
                }

                else {
                    System.out.println("The newly entered password must not be the same as the wrong or forgotten password.");
                }
            }
            else {
                System.out.println("Exit");
                    }


            }

        }

    }
