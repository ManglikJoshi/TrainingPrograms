package objectDemo;

public class objectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		books obj1 = new books("Inner Engineering ","Sadguru", 2012); 
	        books obj2 = new books("i am malala  "," xyz", 2000); 
	    	System.out.println(obj1.toString());
	    	System.out.println(obj2.toString());    
	} 
	} 

class books
{ 
    String Author;
    String Bookname;
    int Year;
  
    books(String bookname, String author,int year) 
    { 
      this.Bookname=bookname;
      this.Author=author;
      this.Year=year;
    } 
    
    public String author()
    {
    	return this.Author;
    }
    
    public String bookname()
    {
    	return this.Bookname;
    }
    public int year()
    {
    	return this.Year;
    }

public String toString()
{
return(this.bookname() +" is written by " +this.author()
+" in the year " +this.year());	
		
}
}




