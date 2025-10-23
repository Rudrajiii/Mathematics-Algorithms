package Series;

public class juggler{
    public static String juggler_series(int n){
        StringBuilder series = new StringBuilder();
        int term = n;
        series.append(term);

        while( term != 1){
            if(term % 2 == 0){
                term = (int)(Math.sqrt(term));
            } else {
                term = (int)(Math.pow(term, 1.5));
            }
            series.append(", ").append(term);
        }
        return series.toString();
    }

    public static void main(String[] args){
        int n = 10;
        for(int i = 1; i <= n; i++){
            System.out.println(juggler_series(i));
        }
    }
} 