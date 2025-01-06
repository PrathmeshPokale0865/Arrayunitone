
import java.util.Scanner;

public class Switchcase
{
    public static void main(String[] args) {
        
        //array is declared as the daysofweek
        int daysofweek;
        
        //it is used for taking input
        Scanner scan=new Scanner(System.in);

        //to print the days of week
        System.out.println("days of week");
        
         //this gives enter no to the output
        daysofweek=scan.nextInt();

        //here the cases are build 
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
