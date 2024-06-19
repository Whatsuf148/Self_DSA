package DSA;

public class removeElement {
    public int[] removeElementFromArray(int[] arr, int dump) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != dump) {
                arr[index] = arr[i];
                index++;
            }
        }
        int[] result = new int[index];
        for (int i = 0; i < index; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        removeElement obj = new removeElement();
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 1};
        int[] arr2 = obj.removeElementFromArray(arr, 3);
        for (int j : arr2) {
            System.out.println(j);
        }
    }
}
