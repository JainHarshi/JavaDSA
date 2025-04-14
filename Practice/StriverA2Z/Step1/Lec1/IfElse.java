package Practice.StriverA2Z.Step1.Lec1;
import java.util.Scanner;

public class IfElse {
    public void studentGrade(int marks) {
        if(marks >= 90) System.out.println("Grade A");
        else if (marks >= 70) System.out.println("Grade B");
        else if (marks >= 50) System.out.println("Grade C");
        else if (marks >= 35) System.out.println("Grade D");
        else System.out.println("Fail");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        IfElse obj = new IfElse();
        obj.studentGrade(n);
        

    }
    
}
