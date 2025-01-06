//used for taking the input
import java.util.Scanner;

public class P04
{
    public static void main(String[] args) {
       
        //here area and radius is declared
        double area,r;
        
        //the scanner system is used for to read the input from user
        Scanner scan=new Scanner(System.in);
        
        //it shows the output as enter the radius
        System.out.println("enter radius");
        
        //stores the value of area and radius 
        r=scan.nextDouble();
        
        //the value is entered here of area
         area=3.14159*r*r;
        //it prints the area
        System.out.println("Area is %f");
}
}
