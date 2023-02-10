package javaprogramms;

class SelectionSort {
    int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 659, 35465, 5498, 12, 9, 52, 57, 82, 8215, 15, 0};
        SelectionSort s = new SelectionSort();
        int[] sortedArray = s.sort(arr);
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + ",");
        }
    }
}
