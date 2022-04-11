public class HarmonicNumbers {
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6,87,8,1,2};

        double average = 0;

        for(double i : numbers){
            i = 1/i;
            i = i / (numbers.length);
            average+=i;
        }
        System.out.println("Harmonic Average :"+average);
        
    }
}
