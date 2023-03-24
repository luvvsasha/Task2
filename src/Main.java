import java.util.Random;

        public class Main {
            public static void main(String[] args) {
                int[] arr = new int[10];
                Random rand = new Random();

                for (int i = 0; i < arr.length; i++) {
                    arr[i] = rand.nextInt(100) + 1;
                }

                MinMaxArray mma = new MinMaxArray();
                int min = mma.getMin(arr);
                int max = mma.getMax(arr);

                System.out.println("Array: " + java.util.Arrays.toString(arr));
                System.out.println("Min: " + min);
                System.out.println("Max: " + max);
            }
        }