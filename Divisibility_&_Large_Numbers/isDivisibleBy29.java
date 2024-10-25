public class isDivisibleBy29 {
    static boolean check(long n){
        while( n / 100 > 0){
            int last_digit = (int) n % 10;
            n /= 10;
            n += last_digit * 3;
        }
        return n % 29 == 0; 
    }
    public static void main(String[] args) {
        long n = 348;
        if(check(n))
            System.out.println("yes");
        else 
            System.out.println("No");
    } 
}
