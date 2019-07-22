package objectDemo2;



public class objectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		calc obj3=new calc(2,3);	        
		calc obj4=new calc(6,5);
		System.out.println(obj3.toString());
		System.out.println(obj4.toString());
	}

}

class calc
{
int no1;
int no2;


calc(int num1,int num2)

{
	this.no1=num1;
	this.no2=num2;
	 }

public int add()
{

	return this.no1+this.no2;

	}

public int mul()
{
	return no1*no2;
	}
public int div()
{
	return no1/no2;
	}
public String toString()
{
return ("ADDITION="+this.add() +  "\nMULTIPLICATION=" +this.mul() + "\nDIVISION"+this.div() );	


}
}
