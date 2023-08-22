package gatacticArithmatic;
import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers: ");
		long num1=scan.nextLong();
		long num2=scan.nextLong();
		System.out.println(galacticArithmatic(num1, num2));
	}
	public static long galacticArithmatic(long num1,long num2) {
		return num1+num2;
	}

}
