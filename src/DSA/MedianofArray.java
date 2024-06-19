package DSA;

import java.util.Arrays;

public class MedianofArray {
    public double findMedian(int[] arr1 , int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int [] arr3 = new int[n+m];
        int k =0;
        for (int j : arr1) {
            arr3[k++] = j;
        }
        for (int j : arr2) {
            arr3[k++] = j;
        }
        Arrays.sort(arr3);

        int total = arr3.length;

        // for odd
        if(total%2==1){
            return (double) arr3[total/2];
        }
        else{
          int mid1 = arr3[total/2 -1];
          int mid2 = arr3[total/2];

          return (double) mid1 + (double) mid2;
        }




    }
    public static void main(String [] args){
        int []a = {1,4,5,7,8,9};
        int []b = {9,6,7,4,5,10,11};
        MedianofArray obj1 = new MedianofArray();
        double median = obj1.findMedian(a,b);
        System.out.println("The median of the given array is "+ median);

    }
}
