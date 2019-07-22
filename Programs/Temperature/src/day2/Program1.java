package day2;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double celsius, farenheit,m,n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter temperature in celcius and farenheit");
		celsius=sc.nextDouble();
		farenheit=sc.nextDouble();
		
	Temperature t =new Temperature();
	
		
		 m=t.ConvertToFarenheit(celsius);
		 n=t.ConvertToCelsius(farenheit);
		
		  System.out.println(m);
		  System.out.println(n);
	}
}
	
	 class Temperature
	{
		

		 double i,j;

		public  Double ConvertToFarenheit(Double celsius)
		 {
			 
			 i=(celsius*1.8)+32;
			 
			 return i;
			 
		 }
		 
		public Double  ConvertToCelsius(Double farenheit)
		 {
			
			 j=(farenheit-32)/1.8;
			 
			 return j;
			 
		 }
		
	}

	

