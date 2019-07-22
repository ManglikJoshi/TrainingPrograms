package day3;

import java.util.Scanner;

import day3.MarkValidator;

public class Program3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String j;
		Boolean m;
		System.out.println("enter marks");
Scanner sc = new Scanner(System.in);
int i=sc.nextInt();
MarkValidator mg=new MarkValidator();
m= mg.isPass(i);
  mg.markGrade(i);
 System.out.println(m);
 System.out.println(i);
 
	}

}

class MarkValidator
{
public boolean isPass(int Mark)
{
	if(Mark>=40)
	{
	return true	;

	}
	else
		return false;

	}



public String markGrade(int mark)
{
	int n = 0;
	 if (isPass(mark)==true)
	 {
		 if(mark>90)
		 {
		
			 n=1;
		 }
		 else if(mark>75)
		 {
	
			 n=2;
		 }
		 else if(mark>60)
		 {
		
			 n=3;
		 }
	 }
			
		 else
	
			 n=4;
	 
		 switch(n)
		 {
		 case 1:
			 return "Grade A";
			 
		 
		 case 2:
			 return "Grade B";
			 
			 
		 case 3:
			 return	"Grade C";
			
			 
		default: return "Grade D";
		
		 }
	

}
}



