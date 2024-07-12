package DSA;

import java.util.Arrays;

public class RotateArray {
    public int[] ArrayRotate(int [] arr){
        int i=0;
        int j = arr.length-1;
        int temp=0;
        while (i<j){
            temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;

        }

       return arr;
    }
    public static void main(String [] args){
        RotateArray obj = new RotateArray();
        int []arrayForRotate = {1,2,3,4,5,6};
        int []newArray = obj.ArrayRotate(arrayForRotate);
        for(int i=0 ; i<newArray.length; i++){
            System.out.println(i);
        }

       // System.out.println(Arrays.toString(obj.ArrayRotate(arrayForRotate)));
    }
}
