import java.util.Objects;

public class arraySort {
    static void sort(Integer[] arr) {
        int positivNum = 0;
        for (int i : arr) {
            if (i > 0)
                positivNum = positivNum + i;

        }
        System.out.println("Сума додатніх елентів: " + positivNum);
    }

    static void average(Integer[] arr) {
        int sumArr = 0;
        for (int i : arr) {
            sumArr = sumArr + i;

        }
        float result =  ((float)sumArr) / ((float)arr.length);
        System.out.println("Середнє значення = " + result);
    }
    public static void invert(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Objects.equals(arr[i], arr[j])) arr[j] = 0;
            }


        }

    }
}
