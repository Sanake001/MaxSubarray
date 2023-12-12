
public class Test {

    public static void main(String [] args){
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    static int maxSubArray(int [] arr){
        int sum = 0;
        int aux = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
            if(sum > aux)
                aux = sum;
            if(sum < 0)
                sum = 0;
        }
        return aux;
    }

}
