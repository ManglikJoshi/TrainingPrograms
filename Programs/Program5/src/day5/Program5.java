package day5;
import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		number=sc.nextInt();
		Factorial f=new Factorial();
		m=f.CalculateFactorial(number);
		System.out.println(m);

	}
}
class Factorial
{
	int j;
public int CalculateFactorial(int number)
{
	j=number;
	while(number>1)
	{
		
	j=j*(number-1);
	number--;
	}
	return j;
	
}
}

