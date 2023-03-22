import java.util.Arrays;

public class BubbleSort {

    public int[] bubbleSort(int[] arrays) {
        int aux = 0;

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length; j++) {
                if (arrays[i] < arrays[j]) {
                    aux = arrays[j];
                    arrays[j] = arrays[i];
                    arrays[i] = aux;
                }
            }
        }
        
        return arrays;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        int[] arrays = { 5, 2, 1, 0 };
        int[] numS = b.bubbleSort(arrays);

        for (int i : numS) {
            System.out.println(i);
        }
    }
}
