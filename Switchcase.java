import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Switchcase
{
    public static void main(String[] args) {
        int daysofweek;
        Scanner scan=new Scanner(System.in);
        System.out.println("days of week");
        daysofweek=scan.nextInt();
        switch(daysofweek){
            case 1:
                System.out.println("sunday");
            case 2:
                System.out.println("monday");
            case 3:
                System.out.println("tuesday");
            case 4:
                System.out.println("wednesday");
            case 5:
                System.out.println("thrusday");
            case 6:
                System.out.println("friday");
            case 7:
                System.out.println("saturday");
             break;
            default:
                System.out.println("invalid day");
        }
    }
}
