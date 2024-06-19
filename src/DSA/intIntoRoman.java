package DSA;

public class intIntoRoman {
    public String integerIntoRoman(int num) {
        int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 1};
        String [] romanLetter = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "I"};
        String roman = "";


        for (int i = 0; i < values.length; i++) {

            while (num >= values[i]) {
                roman = roman + romanLetter[i];
                num = num - values[i];
            }
        }
        return roman;
    }

    public static void main(String[] args) {
        intIntoRoman obj = new intIntoRoman();
        String check = obj.integerIntoRoman(400);
        System.out.println("The Roman numeral of the given number is " + check);
}}
