package Practice.StriverA2Z.Step1.Lec1;
import java.util.Scanner;

public class WeekDayTraditionalSwitch {
    public void week(int n ){
        String s;
        switch(n){
            case 1:
            s = "Monday";
            break;
            case 2:
            s = "Tuesday";
            break;
            case 3:
            s = "Wednesday";
            break;
            case 4:
            s = "Thrusday";
            break;
            default:
            s = "Invalid";
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        WeekDayTraditionalSwitch obj = new WeekDayTraditionalSwitch();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        obj.week(n);

        
    }
    
}
