package DSA;

public class MergedStringAlternate {
    public String mergedString(String wd1 , String wd2){
        StringBuilder result = new StringBuilder();
        int i=0;
        while (i<wd1.length()|| i<wd2.length()){
            if(i<wd1.length()){
                result.append(wd1.charAt(i));
            }
            if(i<wd2.length()){
                result.append((wd2.charAt(i)));
            }
            i++;
        }
        return result.toString();
    }
    public static void main(String [] args){
        MergedStringAlternate obj = new MergedStringAlternate();
        String wd1 = "Sachin";
        String wd2 = "Dhakal";
      String result=  obj.mergedString(wd1,wd2);
      System.out.println("The result after merged Alternate is : "+result);

    }


}
