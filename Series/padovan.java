package Series;

public class padovan{
    public static String generate_padovan_sequence(int n){
        StringBuilder series = new StringBuilder();
        int[] padovan = new int[n];

        for(int i = 0 ; i < n ; i++){
            if(i == 0 || i == 1 || i == 2){
                padovan[i] = 1;
            }else{
                padovan[i] = padovan[i - 2] + padovan[i - 3];
            }
            series.append(padovan[i]);
            if(i != n - 1){
                series.append(", ");
            }
        }
        return series.toString();
    }

    public static void main(String[] args){
        /* 1, 1, 1, 2, 2, 3, 4, 5, 7, 9, 12, 16, 21, 28, 37, */
        int n = 15;
        System.out.println(generate_padovan_sequence(n));
    }
}