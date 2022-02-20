import java.util.Scanner;


public class Manav {
    public static void main(String[] args) {
        float elma, armut, muz, patlican, domates;
        int secim, kasa;

        kasa = 0;

        Scanner inp = new Scanner(System.in);

        int ana_ekran = 1;
        while(ana_ekran == 1) {
            System.out.println("Manav Kasa Programına Hoşgeldiniz.\nÜrünlerimiz:\n1-Elma(3,67 TL)\n2-Armut(2,14 TL)\n3-Muz(0,95 TL)\n" +
                    "4-Patlican(5,00 TL)\n5-Domates(1,11 TL)\n" +
                    "6-Çıkış\n"+"Lütfen Seçim Yapınız :");
            secim = inp.nextInt();
            if (secim == 1) {

                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 3.67);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else if (secim == 2) {

                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 2.14);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else if (secim == 3) {

                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 0.95);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else if (secim == 3) {

                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 2.14);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else if (secim == 4) {

                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 5.00);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else if (secim == 5) {
                System.out.println("Almak İstediğiniz Miktar kg :");
                int miktar = inp.nextInt();
                kasa += (miktar * 1.11);
                System.out.println("Ödenecek Tutar "+kasa+" TL");
            } else {
                ana_ekran = 2;

        }




        }
        System.out.println("\n\nToplam Ödenecek Tutar: "+kasa+ "TL");
    }
}
