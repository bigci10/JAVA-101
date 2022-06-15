public class Main {

    public static void main(String[] args) {

        Fighter fighter1 = new Fighter("Bilal İğci",100,90);
        Fighter fighter2 = new Fighter("Fatih Yıldız",75,75);

        Match match1 = new Match("World Heavyweight Championship",15,fighter1,fighter2);

        match1.playMatch();



    }



}
