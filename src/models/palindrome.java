public class palindrome {
    public boolean solution(int n) {
        boolean answer = true;
        if (n < 0 || (n % 10 == 0 && n !=0)){
            return false;
        }
        int reverse = 0;
        while (n > reverse){
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }
        if (n == reverse || n == reverse / 10){
            return true;
        }
        else {
            return false;
        }
    }
}