public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length-1);
  }

  public static void mergesort(int[] data, int lo, int hi) {
    if (lo >= hi) {
      return;
    }
    int[] left = new int[(hi-lo)/2 + (hi-lo)%2];
    int[] right = new int[(hi-lo)/2];
    for (int i = 0; i < left.length; i++) {
      left[i] = data[i];
    }
    for (int i = 0; i < right.length; i++) {
      right[i] = data[i + left.length];
    }
  }
}
