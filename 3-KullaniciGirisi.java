import java.util.Scanner;


public class Kullanici {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String username , password , cevap , user , pass , newpass;

        user = "bigci10";
        pass = "123456";


        System.out.println("-----------Hoşgeldiniz--------------");

        System.out.println("Kullanıcı Adı :");
        username = s.nextLine();

        System.out.println("Parola :");
        password = s.nextLine();


        if ((username == user) && (password == pass)){
            System.out.println("Hoşgeldiniz "+user);
                }
        else{
            System.out.println("Bilgileriniz Hatalı");
            System.out.println("Parola sıfırlamak istiyor musunuz(Y/N)");
            cevap = s.nextLine();
            if(cevap.equals("Y") || cevap.equals("y")) {

                System.out.println("Yeni Parolayı Giriniz :");
                newpass = s.nextLine();

                if ((pass != newpass) && (password != newpass)){
                    System.out.println("Yeni Parolanız Oluşturuldu.");
                }

                else {
                    System.out.println("Yeni girdiğiniz şifrenin hatalı veya unutulan şifre ile aynı olmaması gerekmektedir.");
                }
            }
            else {
                System.out.println("Sistemden Çıkıldı....");
                    }


            }

        }

    }
