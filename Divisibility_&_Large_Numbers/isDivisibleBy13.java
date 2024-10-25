public class isDivisibleBy13 {
    static boolean check(String str){
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
