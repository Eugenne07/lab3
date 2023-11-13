package ex2;

public class Main {
    static int checkPrime(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            return -1;
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    return -1;
                }
            }
            if (flag == 0) {
                return 1;
            }
        }
        return 0;
    }
    public static void main (String[]args){
        int[] sir = {1, 2, 5, 7, 13, 15, 17, 20, 22, 31};
        for(int i : sir){
            if(checkPrime(i)== 1){
                System.out.println(i);
            }
        }
    }
}