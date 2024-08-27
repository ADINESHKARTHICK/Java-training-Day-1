import java.util.*;
public class UniqueElement{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=(a>b)?((a>c)?a:c):((b>c)? b:c);
        System.out.println("Greatest among three numbers" +d);
    }
}
