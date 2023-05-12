import java.util.Arrays;

public class loops_streams {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};


        for (int i = 0; i < numbers.length; i++) {
            System.out.println(" for loop: " + numbers[i]);
        }


        int j = 0;
        while (j < numbers.length) {
            System.out.println(" while loop: " + numbers[j]);
            j++;
        }


        int k = 0;
        do {
            System.out.println(" do-while loop: " + numbers[k]);
            k++;
        } while (k < numbers.length);


        Arrays.stream(numbers)
                .forEach(n -> System.out.println(" stream: " + n));
    }
}
