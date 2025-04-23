package Coaching.April23;

public class BonusBetterPS {
    public static void main(String[] args) {
        
    
    int n = 2;
    char g = 'F';
    int sal = 5000;
    int bonus = 0;
    if(n>0 && n<= 2 && g == 'M'){
        System.out.println((sal*0.1));
    }
    if(n>=0 && n<= 2 && g == 'F'){
        System.out.println((sal*0.12));
    }
    if(n>=3 && n<= 5 && g == 'M'){
        System.out.println((sal*0.2));
    }
    if(n>=3 && n<= 5 && g == 'F'){
        System.out.println((sal*0.22));}
    }

}

