package day2;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String j;
		Boolean m;
		System.out.println("enter marks");
Scanner sc = new Scanner(System.in);
int i=sc.nextInt();
MarkValidator mg=new MarkValidator();
m= mg.isPass(i);
 j= mg.markGrade(i);
 System.out.println(m);
  System.out.println(j);
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
		 if (isPass(mark)==true)
		 {
			 if(mark>90)
			 {
				 return "Grade A";
			 }
			 else if(mark>75)
			 {
				 return "Grade B";
			 }
			 else if(mark>60)
			 {
				 return "Grade C";
			 }
				
			 
		 }
		
		  return " Grade D";
		
	
}
}

