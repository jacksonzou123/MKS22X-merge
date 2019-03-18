import java.util.*;

public class Merge{
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length-1);
  }

  public static void mergesort(int[] data, int lo, int hi) {
    if (lo >= hi) {
      //System.out.println(Arrays.toString(data));
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
    int index = 0;
    while (lindex < left.length && rindex < right.length) {
      if (left[lindex] <= right[rindex]) {
        data[index] = left[lindex];
        lindex++;
      }
      else {
        data[index] = right[rindex];
        rindex++;
      }
      index++;
    }
    while (lindex < left.length) {
      data[index] = left[lindex];
      lindex++;
      index++;
    }
    while(rindex < right.length) {
      data[index] = right[rindex];
      rindex++;
      index++;
    }
    //System.out.println(Arrays.toString(left));
    //System.out.println(Arrays.toString(right));
  }

  public static void main(String[] args) {
    Random random = new Random();

    int[] ary = new int[100000];
    for (int i = 0; i < 10000; i++) {
      ary[i] = random.nextInt() % 10000;
    }
    mergesort(ary);
    boolean yes = true;
    for (int i = 0; i < 9999; i++) {
      if (ary[i] > ary[i+1]) {
        yes = false;
      }
    }
    System.out.println(Arrays.toString(ary));
    System.out.println(yes);
  }
}
