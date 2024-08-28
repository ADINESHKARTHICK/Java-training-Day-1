import java.util.*;
public class string{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='@'){
                for(int j=i+1;j<a.length();j++)
                {
                    System.out.print(a.charAt(j));
                }
            }
        }
}
}
