package Gcd_Lcms;

public class lcm_of_array {
    //*LCM -> least common multiple , which is smallest number divisible by both the input numbers */
    /*
     *  Euclidean Algoritm;
     *  GCD = Func(b , a % b);
     *  LCM(A , B) = A * B / GCD(A , B);
     */
    static int _gcd(int a , int b ){
        if(b == 0)
            return a;
        return _gcd(b , a % b);
    }
    static int _lcm(int a , int b){
        return (a * b) / _gcd(a, b);
    }
    static int gcdOfArray(int[] arr){
        int gcd = _gcd(arr[0] ,arr[1]);
        for(int i = 2; i < arr.length ; i++){
            gcd = _gcd(arr[i] , gcd);
            if(gcd == 1){
                break;
            }
        }
        return gcd;
    }
    static int LcmOfArray(int[] arr){
        int lcm = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            lcm = _lcm(lcm , arr[i]);
        }
        return lcm;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,8,3};
        int gcd_res = gcdOfArray(arr);
        int lcm_res = LcmOfArray(arr);
        System.out.println(gcd_res + ":" + lcm_res);
    }
}
