import java.util.*;
public class Marks
{
	public static void main(String[] args) {
	    Scanner scanner=new Scanner(System.in);
		int Java, Python, Dbms,result;
		System.out.println("Enter the name");
		String Namee=scanner.nextLine();
		System.out.println("Enter the department");
		String Department=scanner.nextLine();
		System.out.println("Enter the value for Java");
		Java=scanner.nextInt();
		System.out.println("Enter the value for Python");
		Python=scanner.nextInt();
		System.out.println("Enter the value for Dbms");
		Dbms=scanner.nextInt();
		result=Java+Python+Dbms;
		System.out.println("the result is" + result);
		scanner.close();
	}
}
