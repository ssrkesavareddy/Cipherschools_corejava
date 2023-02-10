import java.util.Scanner;

class ArrayManipulation {
  int[] arr;

  public ArrayManipulation(int n) {
    arr = new int[n];
  }

  public void inputArray() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    sc.close();
  }

  public void displayArray() {
    System.out.println("The elements of the array are:");
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
  }

  public void reverseArray() {
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = temp;
    }
  }

  public void sortArray() {
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
}

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of elements in the array: ");
    int n = sc.nextInt();
    sc.close();

    ArrayManipulation obj = new ArrayManipulation(n);
    obj.inputArray();
    obj.displayArray();
    System.out.println("\nReversed elements of the array are:");
    obj.reverseArray();
    obj.displayArray();
    System.out.println("\nSorted elements of the array are:");
    obj.sortArray();
    obj.displayArray();
  }
}
