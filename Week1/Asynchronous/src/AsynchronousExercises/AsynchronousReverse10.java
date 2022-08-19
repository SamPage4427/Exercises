package AsynchronousExercises;

public class AsynchronousReverse10 {
    public static void main(String[] args) {
        int[] integers = {12,15,32,56,78,19,24,36,42,17};

        System.out.println("Created Integers: ");

        for(int i = 0; i < integers.length; i++){
            System.out.println(integers[i]);

        }

        System.out.println("Integers Backwards: ");


        for(int i = integers.length - 1; i >= 0; i--){
            System.out.println(integers[i]);
        }
    }
}
