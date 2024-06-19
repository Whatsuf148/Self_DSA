package DSA;



public class romIntoInt {
    public  int getVal(char c){
        switch (c){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }


        }
    public int romanIntoInteger(String s){
        int n  = s.length();
        int sum =0;
        for(int i =0 ; i<n ; i++){
            char c1 = s.charAt(i);
            if((i+1)<n && getVal(c1)< getVal(s.charAt(i+1))){
                sum = sum-getVal(c1);
            }
            else{
                sum = sum+getVal(c1);
            }
        }
        return sum;
    }
    public static void main(String [] args ){
        romIntoInt obj = new romIntoInt();
        int intoInteger = obj.romanIntoInteger("IX");
        System.out.println(intoInteger);
    }
}
