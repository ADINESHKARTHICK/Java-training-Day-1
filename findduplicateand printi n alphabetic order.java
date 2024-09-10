import java.util.*;
public class FrequencyArray{
    public static void main(String[] args){
        String santhosh="jill jumg jukk";
        int fmadhava[]=new int[257];
        int c=0;
        char[]m=santhosh.toCharArray();
        for(int i=0;i<m.length;i++){
            fmadhava[m[i]]++;
        }
        for(int i=0;i<257;i++){
            if(fmadhava[i]>1&&i!=32){
                System.out.print((char)i+"");
            }
        }
    }
}
