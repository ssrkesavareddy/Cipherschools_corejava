public class FibonacciSeries {
  public static void main(String[] args) {
    FibonacciSeries obj = new FibonacciSeries();

    int num = 10;
    System.out.println("The first " + num + " terms of the Fibonacci series are:");
    for (int i = 0; i < num; i++) {
      System.out.print(obj.fibonacci(i) + " ");
    }
  }

  public int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
