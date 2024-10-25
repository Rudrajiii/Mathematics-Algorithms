public class isDivisibleBy9 {
    static boolean check(String str){
        int digitSum = 0;
        for(int i = 0 ; i < str.length() ; i++){
            digitSum += (str.charAt(i) - '0');
        }
        return digitSum % 9 == 0;
    }
    public static void main(String[] args){
        boolean result = check("99333");
        if(result)
            System.out.println("Yes divisible by 9");
        else
            System.out.println("Not divisible by 9");
    }
}
