import java.util.*;

public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length-1);
  }

  public static void mergesort(int[] data, int lo, int hi) {
    if (lo >= hi) {
      System.out.println(Arrays.toString(data));
      return;
    }
    int[] left = new int[(hi-lo+1)/2 + (hi-lo+1)%2];
    int[] right = new int[(hi-lo+1)/2];
    for (int i = 0; i < left.length; i++) {
      left[i] = data[i];
    }
    for (int i = 0; i < right.length; i++) {
      right[i] = data[i + left.length];
    }
    mergesort(left, lo, lo + left.length-1);
    mergesort(right, lo + left.length, hi);
    int lindex = 0;
    int rindex = 0;
    
    //System.out.println(Arrays.toString(left));
    //System.out.println(Arrays.toString(right));
  }

  public static void main(String[] args) {
    int[] ary = new int[] {1,3,4,5,11,4,4};
    System.out.println(Arrays.toString(ary));
    mergesort(ary);
  }
}
