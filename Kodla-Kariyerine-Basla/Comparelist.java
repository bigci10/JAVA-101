import java.util.*;

public class Solutions {
    public static void main(String[] args) {
        String[] liste1 = new String[]{"A", "B", "C", "D", "E", "F"};
        String[] liste2 = new String[]{"B", "C", "E", "G"};

        Set<String> set = new HashSet<>();
        for (int i = 0; i < liste1.length; i++) {
            for (int j = 0; j < liste2.length; j++) {
                if (liste1[i] == liste2[j]) {

                    // add common elements
                    set.add(liste1[i]);
                    break;
                }
            }
        }
        System.out.println(set);


    }
}
