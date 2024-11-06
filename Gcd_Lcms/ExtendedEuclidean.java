package Gcd_Lcms;

public class ExtendedEuclidean {
    public static int extended_gcd(int a, int b, int[] xy) {
        if (a == 0) {
            xy[0] = 0;
            xy[1] = 1;
            return b;
        }

        int[] xy1 = {1, 1};  // Temporary array to store results of recursive call
        int gcd = extended_gcd(b % a, a, xy1);

        // Update x and y using the results of the recursive call
        xy[0] = xy1[1] - (b / a) * xy1[0];
        xy[1] = xy1[0];
        
        return gcd;
    }

    public static void main(String[] args) {
        // Array to hold x and y
        int[] xy = {1, 1};
        int a = 35, b = 15;
        int g = extended_gcd(a, b, xy);
        
        System.out.println("gcd(" + a + " , " + b + ") = " + g);
        System.out.println("Coefficients x and y are: " + xy[0] + " and " + xy[1]);
    }
}
