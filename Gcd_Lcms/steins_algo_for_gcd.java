package Gcd_Lcms;
public class steins_algo_for_gcd {

    public static int gcd_by_steins_algo(int a , int b){
        /* lets check for the base conditions first */
        if(a == 0) return b;
        if(b == 0) return a;

        /* lets find out the k first */
        /* what is k ? */
        /* k is the value of how many times both a and b are divided by 2 */
        /* simply speaking common factor of 2 */
        int k = 0;
        while(((a & 1) == 0) && ((b & 1) == 0)){
            /* check if both a and b is even or not */
            /* if yes then divided by 2 */
            /* this division of 2 is as similar as shifting 1 bit from that number to the right */
            /* and lastly increment k by 1 */
            a >>= 1;
            b >>= 1;
            k++;
        }

        /* now we are sure that one of them are odd or both are odd*/
        /* so we generally assume a is odd if not then we try to make it odd first */
        /* this single line of code ensures that a will always be odd */
        while((a & 1) == 0) a >>= 1;
        /* now we can finally start with the steins algorithm*/
        /* if b is even make it odd by shifting 1 bit to right untill it become odd*/
        /* if both a and b is odd */
        /* subtract (make sure b >= a else swap) them to get the even number */ 
        /* divide it by 2 untill it become a odd number */
        /* repeat the steps untill b becomes 0 */
        while (b != 0) {
            while((b & 1) == 0) b >>= 1;
            if ( a > b ) {
                int temp = a;
                a = b;
                b = temp;
            }
            b = ( b - a );
        }
        return a << k;
    }
    
    public static void main(String[] args){
        int a = 34;
        int b = 17;
        
        int res = gcd_by_steins_algo(a , b);
        System.out.println("GCD of " + a + " and " + b + " is: " + res);
    }
}
