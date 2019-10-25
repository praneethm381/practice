package round1;

import java.util.HashSet;

// Java program to find four numbers in a given
// array whose sum is zero

class FourSumZero
{
  // function to print four numbers with 0 sum
  static void findFourSumZero(int arr[], int n)
  {
    boolean found = false;

    for (int i = 0; i < n - 2; i++)
    {
      // Find all pairs with sum equals to
      // "-arr[i]"
      HashSet<Integer> s = new HashSet<Integer>();
      for (int j = i + 1; j < n-1; j++)
      {
        for (int k = j+1; k<n; k++) {
          int x = -(arr[i] + arr[j] + arr[k]);
          if (s.contains(x))
          {
            System.out.printf("%d %d %d %d\n", x, arr[i], arr[j], arr[k]);
            found = true;
          }
          else
          {
            s.add(arr[j]);
            s.add(arr[k]);
          }
        }
      }
    }

    if (found == false)
    {
      System.out.printf(" No Triplet Found\n");
    }
  }

  // Driver code
  public static void main(String[] args)
  {
    int arr[] = {0, -1, 2, 3, -4, -6, -3, 1};
    int n = arr.length;
    findFourSumZero(arr, n);
  }
}
