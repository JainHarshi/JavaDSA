package Practice.StriverA2Z.Step1.Lec1;

class  While {
    public static void main(String[] args) {
        int fact = 1;
        int n = 5;
        while(n>1){
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
