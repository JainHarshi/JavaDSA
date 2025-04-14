package Practice.StriverA2Z.Step1.Lec1;

public class WeekDayEnanchedSwitch {
        public void whichWeekDay(int day) {
            String ans = switch (day) {
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";  
                case 5 -> "Friday";
                case 6 -> "Saturday";
                case 7 -> "Sunday";
                default -> "Invalid";
            };
            System.out.println(ans);
        }
        public static void main(String[] args) {
            WeekDayEnanchedSwitch obj = new WeekDayEnanchedSwitch();
            obj.whichWeekDay(7);
        }
    }
    
    

