import java.util.Scanner;
public class training {

    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int age;
        System.out .println("Enter your age: ");
        age=s.nextInt();
        if (age>=18){
            System.out.println("Eligible to vote for TVK");
        }
        else{
            System.out.println("Not Eligible to vote for TVK");
            
        }
    }
    
}

