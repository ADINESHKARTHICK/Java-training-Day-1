import java.util.*;
public class TicketBooking{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.println("Enter your seat number");
        num=sc.nextInt();
        if (num>72)
        {
            System.out.println("Seat not exceeds");
        }
        else if (num%8==1)
        {
            System.out.println("upper berth");
        }
        else if (num%8==2)
        {
            System.out.println("Middle berth");
        }
        else if (num%8==3)
        {
            System.out.println("lower berth");
        }
        else if (num%8==4)
        {
            System.out.println("upper berth");
        }
        else if (num%8==5)
        {
            System.out.println("middle berth");
        }
        else if (num%8==6)
        {
            System.out.println("lower berth");
        }
        else if (num%8==7)
        {
            System.out.println("side upper berth");
        }
        else if (num%8==0)
        {
            System.out.println("side lower berth");
        }
        
        else
        {
            System.out.println("No seats");
        }
        
    }
}
