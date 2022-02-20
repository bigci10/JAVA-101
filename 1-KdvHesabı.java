import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        float kdvsiz,kdvli;
        Scanner giris = new Scanner(System.in);

        System.out.print("Ürünün Fiyatını Girin: ");
        kdvsiz = giris.nextFloat();
        kdvli = ((kdvsiz*18)/100f)+kdvsiz;

        System.out.println("Ürünün KDV li fiyatı: "+kdvli);
        System.out.println("ürünün KDV tutarı: "+(kdvli-kdvsiz));
    }
}
