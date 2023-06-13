import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array1 = new int[7];
        int[] array2 = new int[7];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = random.nextInt(10);
            array2[i] = random.nextInt(10);
        }

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

        int count = 0;
        System.out.print("Збіги по індексу: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
                System.out.print(i + ", ");
            }
        }
        System.out.println();

        if (count > 0) {
            System.out.println("Кількість збігів " + count);
        } else {
            System.out.println("Збігів не має ");
        }
    }
}

