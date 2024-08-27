import java.util.*;
public class UniqueElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,result;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        //Using E-OR operation,0^0=0,1^1=1,0^1=1,more than 2 can't use E-OR operation
        result=a^b^c^d^e;
        
        System.out.println("Unique Element is"+result);
    }
}
