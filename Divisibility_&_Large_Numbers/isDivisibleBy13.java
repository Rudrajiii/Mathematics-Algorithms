public class isDivisibleBy13 {
    static boolean check(String str){

        /*
        ? A number is divisible by 13 if and if the alternating sum (alternatively adding and subtracting) of blocks of three from right to left is divisible by 13. For example, 2911285 is divisible by 13 because the alternating sum of blocks of size 3 is 2 – 911 + 285 = -650 which is divisible by 13.
         * A number is divisible by 13 if and only if the number obtained by adding the last digit multiplied by 4 to the rest is also divisible by 13. 
         * For example, consider 2353. Applying above rule, we get 235 + 3*4 = 247. Again we apply the rule and get 24 + 7*4 = 52. Since 52 is divisible by 13, the given number is divisible by 13.  
         */

        if(str.length() == 1 && str.charAt(0) == '0')
            return true;
        int sum = 0;
        int m = 1;
        for(int i = str.length() - 1; i >= 0 ;){
            int group = 0;
            group += (str.charAt(i--) - '0');
            if (i >= 0)
                group += (str.charAt(i--) - '0') * 10;
            if (i >= 0)
                group += (str.charAt(i--) - '0') * 100;

            sum  += m * group;

            m*= -1;
        }
        sum = Math.abs(sum);
        return sum % 13 == 0;
    } 
    public static void main(String[] args) {
        if(check("83959092724"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
