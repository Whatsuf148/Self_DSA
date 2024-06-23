package DSA;

import java.util.Arrays;

public class RotateArray {
    public int[] ArrayRotate(int [] arr){
        int l = arr.length;
        int sl = arr.length-2;
        for(int i=sl ; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0]=l;
        return arr;
    }
    public static void main(String [] args){
        RotateArray obj = new RotateArray();
        int []arrayForRotate = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(obj.ArrayRotate(arrayForRotate)));
    }
}
