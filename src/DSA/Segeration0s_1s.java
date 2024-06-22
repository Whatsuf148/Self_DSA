package DSA;

import java.util.Arrays;

public class Segeration0s_1s {
    public int [] segregation(int[] arr){
        int c=0;
        for(int values:arr){
            if(values==0){
                c++;
            }}
            for(int i=0;i<c;i++){
                arr[i]=0;
            }
            for(int i=c; i<arr.length;i++){
                arr[i]=1;
            }
        return arr;
        }
    public static void main (String []args){
        int[] arrOfZeroAndOne = {0,1,1,0,0,1,0,1,1,0};
        System.out.println(Arrays.toString(arrOfZeroAndOne));
        Segeration0s_1s obj = new Segeration0s_1s();
        obj.segregation(arrOfZeroAndOne);
        System.out.println(Arrays.toString(arrOfZeroAndOne));
    }
    }


