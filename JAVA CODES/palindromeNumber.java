public class palindromeNumber {
    public static boolean palindromeNumber(int n){
        if(n<0){
            return false;
        }
        int original = n;
        int reversed = 0;
        while(n>0){
            int digit = n%10;
            reversed = reversed*10  + digit;
            n/=10;
            
        }
        return reversed==original;
    }
    public static void main(String[] args){
        System.out.println(palindromeNumber(2682));
    } 
}
