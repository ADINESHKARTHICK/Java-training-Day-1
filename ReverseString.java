import java.util.*;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String vari=sc.nextLine();
        for(int i=vari.length()-1;i>=0;i--){
            System.out.print(vari.charAt(i));
        }
    }
}
