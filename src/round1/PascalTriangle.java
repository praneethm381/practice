package round1;//import java.util.Scanner;
//
//public class round1.PascalTriangle {
//
//  public static void print(int row) {
//    for (int n = 0; n < row; n++) {
//      for (int k = 0; k <= n; k++) {
//        System.out.print(nCk(n, k) + " ");
//      }
//      System.out.println();
//    }
//  }
//
//  public static long nCk(int n, int k) {
//    long numerator = fact(n);
//    long denominator = fact(k) * fact(n - k);
//    long result = (long) (numerator / denominator);
//    return result;
//  }
//
//  public static long fact(int num) {
//    long result = 1;
//    for (int i = 1; i <= num; i++) {
//      result = result * i;
//    }
//    return result;
//  }
//
//  public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter the row number upto which Pascal's triangle has to be printed: ");
//    int row = scanner.nextInt();
//    print(row);
//  }
//}


//Java code for Pascal's Triangle
//import java.io.*;
//
//class round1.PascalTriangle {
//
//  // Function to print first
//  // n lines of Pascal's Triangle
//  static void printPascal(int n)
//  {
//
//    // Iterate through every line
//    // and print entries in it
//    for (int line = 0; line < n; line++)
//    {
//      // Every line has number of
//      // integers equal to line number
//      for (int i = 0; i <= line; i++)
//        System.out.print(binomialCoeff
//            (line, i)+" ");
//
//      System.out.println();
//    }
//  }
//
//  // Link for details of this function
//  // https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
//  static int binomialCoeff(int n, int k)
//  {
//    int res = 1;
//
//    if (k > n - k)
//      k = n - k;
//
//    for (int i = 0; i < k; ++i)
//    {
//      res *= (n - i);
//      res /= (i + 1);
//    }
//    return res;
//  }
//
//  // Driver code
//  public static void main(String args[])
//  {
//    int n = 50;
//    printPascal(n);
//  }
//}

// java program for Pascal's Triangle
// A O(n^2) time and O(n^2) extra
// space method for Pascal's Triangle

class PascalTriangle {
  public static void main (String[] args) {
    int n = 7;
    printPascal(n);
  }

  public static void printPascal(int n)
  {
    // An auxiliary array to store generated pascal triangle values
    int[][] arr = new int[n][n];

    // Iterate through every line and print integer(s) in it
    for (int line = 0; line < n; line++)
    {
      // Every line has number of integers equal to line number
      for (int i = 0; i <= line; i++)
      {
        // First and last values in every row are 1
        if (line == i || i == 0)
          arr[line][i] = 1;
        else // Other values are sum of values just above and left of above
          arr[line][i] = arr[line-1][i-1] + arr[line-1][i];
        System.out.print(arr[line][i]+" ");
      }
      System.out.println("");
    }
  }
}
