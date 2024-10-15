class isDivisibleBy4{

    /*
     * Time Complexity: O(1), as we are not using any loops for traversing.
     * Auxiliary Space: O(1), as we are not using any extra space. 
    */
    static boolean isDivisible(String str){
          //Thought Process

          /*
            Let us consider 76952, we can write it as
            76952 = 7*10000 + 6*1000 + 9*100 + 5*10 + 2
            The proof is based on below observation:
            Remainder of [[/ 10^i divided by 4 is 0 if i greater 
            than or equal to two /]]. Note than 100, 1000,
            ... etc lead to remainder 0 when divided by 4.

            So remainder of "7*10000 + 6*1000 + 9*100 + 
            5*10 + 2" divided by 4 is equivalent to remainder 
            of following : 
            0 + 0 + 0 + 5*10 + 2 = 52
            Therefore we can say that the whole number is 
            divisible by 4 if 52 is divisible by 4.
          */

        int n = str.length();
        if( n == 0)
           return false;
        if(n == 1)
           return ((str.charAt(0) - '0') % 4 == 0);

        //will get last two digits
        int last_digit = str.charAt(n - 1) - '0';
        int second_last_digit = str.charAt(n - 2) - '0';
        return ( second_last_digit * 10 + last_digit ) % 4 == 0;

    }

    public static void main(String[] args){
        String str = "76952"; 
        // Function call 
        if (isDivisible(str)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}


