import java.util.Scanner;
public class Whilesatement {
    public static void main(String[] args) {
        int n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the no");
        n= scan.nextInt();
        int count,i;
        count=0;
        i=1;
        while (i<=n){
            if (n%i == 0) {
                count++;

            }
                i++;
            }
        if(count==2){
            System.out.println("it is prime");
        }else{
            System.out.println("it is not prime");
        }
    }
}
