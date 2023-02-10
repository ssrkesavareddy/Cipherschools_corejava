public class BinarySearch {
  public static void main(String[] args) {
    int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
    int key = 12;

    int index = binarySearch(arr, key);

    if (index == -1) {
      System.out.println("Key not found in the array");
    } else {
      System.out.println("Key found at index: " + index);
    }
  }

  public static int binarySearch(int[] arr, int key) {
    int low = 0;
    int high = arr.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      if (arr[mid] == key) {
        return mid;
      } else if (arr[mid] < key) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
