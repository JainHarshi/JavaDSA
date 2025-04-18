package Coaching.April18;

public class ElectricityBill {
    public static void main(String[] args) {
        int amt = 250;
        if(amt <= 0) { System.out.println("No Bill");}
        if(amt > 0 && amt<= 100){
            System.out.println(amt*2.5);
        }
        if(amt >= 101 && amt<= 200){
            amt = amt-100;
            System.out.println(amt*3.5 + 250);
        }
        if(amt >= 201 && amt<= 250){
            amt = amt-200;
            System.out.println(amt*5 + 600);
        }
        if(amt >250){
            amt = amt-250;
            System.out.println(amt*7.5 + 850);
        }
    }
}
