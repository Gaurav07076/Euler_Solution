//Counting sundays

public class Ques19{
    public static void main(String[] args) {
        int count = 0;
        for (int y = 1901; y <= 2000; y++) {
            for (int m = 1; m <= 12; m++) {
                if (dayOfWeek(y, m) == 0)  // Sunday
                    count++;
            }
        }
        System.out.println(count);
    }
    public static int dayOfWeek(int year,int month){
        int m = (month - 3 + 4800) % 4800;
        int y = (year + m / 12) % 400;
        m %= 12;
        return (y + y/4 - y/100 + (13 * m + 2) / 5 + 1 + 2) % 7;
    }
}
