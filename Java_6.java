package amdocs_collections;
import java.util.Scanner;

class SalaryException extends Exception{
	SalaryException(String message){
		super(message);
	}
}

public class ExceptionDemo {
	public static void main(String arg[]) {
		System.out.println("Enter your salary : ");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		
		try {
			if(salary<2100) {
				throw new SalaryException("You need to work hard");
			}
			else if(salary >=2100 && salary < 5000) {
				throw new SalaryException("Your salary is somehow good");
			}
			else if(salary >=5100 && salary<9000) {
				throw new SalaryException("Salary is very good");
			}
		}
		catch(SalaryException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("End of program");
		}
	}
}
