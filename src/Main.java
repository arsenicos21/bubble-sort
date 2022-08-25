public class Main {

    public static void main(String[] args) {
        int[] array = {3, 67, 4, 2, 40, 92, 12, 1};

        bubbleSort(array);
        for (int i = 0; i <  array.length; i++) {
            System.out.print(array[i] + "  ");
        }
    }

    public static void bubbleSort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + 1]) {
                int tmp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = tmp;
                }
            }
        }
    }
}
