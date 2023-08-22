package type3andtype4;
import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your name:");
		String name=scan.next();
		System.out.println("enter your yob: ");
		int yob=scan.nextInt();
		greet(name);
		int res=calAge(yob);
		System.out.println("you are "+res+" years old");
		
	}
	public static void greet(String name) {
		System.out.println("hello "+name);
		
	}
	public static int calAge(int yob) {
		return 2023-yob;
	}

}
