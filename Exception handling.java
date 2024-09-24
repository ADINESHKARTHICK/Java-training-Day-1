import java.util.*;
public class ExceptionHandling{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
            int a=sc.nextInt();
            int b=sc.nextInt();
            System.out.print(a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.print("Exception not handled");
        }
    }
}
