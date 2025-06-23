public class IsPallindrome {
    public static void main(String[] args) {
        int n = 1213;
      int rev = Pallindrome(n , 0);  
      if(rev == n){
        System.out.println(n + "  is the  Pallindone");
      }
      else{
        System.out.println(n + "  is not a the  Pallindone");

      }
    }
    public static int Pallindrome(int n , int rev){
        if(n == 0){
            return rev;
             
        }
        rev = rev*10 + n%10;
        return Pallindrome(n/10, rev);

    }
}
