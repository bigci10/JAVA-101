public class PrimeNumber {
  //Primenumber from 1 to 100.
    public static void main(String[] args) {
        
        for(int i=2; i <= 100; i++) {
            int tot = 0;
            for(int x=1; x<=i; x++) {
                if(i%x==0){
                    tot ++;
                }
            }
            if(tot <= 2)
                System.out.println(i);
        }
    }
}
