package D;

public class Enumm {
    public enum DayOfWeek{
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY;


        public boolean isWorkday(){
            return (this !=SATURDAY && this!=SUNDAY);
        }
        public static void main(String[] args) {
            System.out.println("Is Monday a workday? " + DayOfWeek.MONDAY.isWorkday());
            // Check if Saturday is a workday
            System.out.println("Is Saturday a workday? " + DayOfWeek.SATURDAY.isWorkday());
        }
    }
}

