package DSA;

    class ProductExceptItSelf {
    public int[] checkProduct(int[] num){
        int [] res = new int[num.length];
        for(int i=0;i<num.length;i++){
            int mul = 1;
            for(int j=0; j <num.length; j++){
                if(i!=j){
                    mul = mul*num[j];
                }
                res[i]=mul;
            }

        }
        return res;
    }



    public static void main(String [] args){
          ProductExceptItSelf obj =new ProductExceptItSelf();
        int [] check = {1,2,3,4};
        int[] result = obj.checkProduct(check);

        // Print the result
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }


        }
    }

