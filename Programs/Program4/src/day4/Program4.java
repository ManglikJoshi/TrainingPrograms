package day4;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int start,end,j,k;
		Scanner sc=new Scanner(System.in);
System.out.println("enter start and end of number");
start=sc.nextInt();
end=sc.nextInt();
SumOfNumbers sm=new SumOfNumbers();
j=sm.SumOfEvenNumbers(start,end);
k=sm.SumOfOddNumbers(start,end);
System.out.println("Sum of even number is:"+j);
System.out.println(k);
	}

}

class  SumOfNumbers
{
	int m=0,a,n,i,p=0,q;
	
	 public int SumOfEvenNumbers(int start,int end)
	 {
		 for(n=start;n<=end;n++)
		 {
			 if(n%2==0)
			 	 
			m=m+n;	 
			 
		 }
		return m; 
	 }
	 
	 public int SumOfOddNumbers(int start,int end)
	 {
		 
		 for(i=start;i<=end;i++)
		 {
			 if(i%2!=0)
			 	 
			p=p+i;	 
			 
		 }
		return p; 
		 
		 
	 }
}

