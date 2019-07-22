package example2;

class ClassObject
{
public static void main(String[] args) 
{ 
    Dog d = new Dog("Dobby","Labrador", 8, "white"); 
    Dog j = new Dog("bully","Bulldog", 10, "Brown"); 
    System.out.println(d.toString());
    System.out.println(j.toString());
} 
}
 class Dog 
{ 
    
    String name; 
    String breed; 
    int age; 
    String color; 
  
   
     Dog(String name, String breed, 
                   int age, String color) 
    { 
        this.name = name; 
        this.breed = breed; 
        this.age = age; 
        this.color = color; 
    } 
  
   
    public String getName() 
    { 
        return name; 
    } 
  
    
    public String getBreed() 
    { 
        return breed; 
    } 
  
    
    public int getAge() 
    { 
        return age; 
    } 
  
   
    public String getColor() 
    { 
        return color; 
    } 
  
   
    public String toString() 
    { 
        return("Hi my name is "+ this.getName()+ 
               ".\nMy breed, age and  color are " + 
               this.getBreed()+" ," + this.getAge()+ 
               " ,"+ this.getColor()); 
    } 
  
   
} 