package DSA;
import java.util.*;

import static java.lang.Math.*;

public class ContainerWithWater {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        while(left < right){
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * w;
            max = Math.max(max, area);
            if(height[left] < height[right]) left++;
            else if(height[left] > height[right]) right--;
            else {
                left++;
                right--;
            }
        }
        return max;
    }
    public  static  void main(String [] args){
        int[] check = {1,8,6,2,5,4,8,3,7,4};
        ContainerWithWater obj1 = new ContainerWithWater();
        int firstAnswer = obj1.maxArea(check);
        System.out.println("The first Answer is "+firstAnswer);

    }
    }




