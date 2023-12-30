 import java.util.*;


 
public class SwitchMath
{
 
 
 
public static void main (String[]args)

  {
    
 
Scanner s = new Scanner (System.in);
  
  
 
int a, b;
 
   
 
System.out.println ("enter two numbers");

    
a = s.nextInt ();

    
b = s.nextInt ();

    
System.out.println ("1.add\n2.sub\n3.mul\n4.div");
   
 
 
 
System.out.println ("enter choice");
 
   
int c = s.nextInt ();

switch (c)
  
{


case 1:

{
	 
System.out.println ("sum is" + (a + b));


}


break;


case 2:

{
	  
System.out.println ("difference is" + (a - b));
	
}
	

break;
      

case 3:
	
	
{
	  
System.out.println ("product is" + (a * b));
}
	


break;
      

case 4:

	
	
{
	  
System.out.println ("division value is" + (a / b));


}
	

break;
      

case 5:
	
	
{
	  S
ystem.out.println (a % b);
	

}
	

break;
      
 

default:
	
	
{
	  
System.out.println ("invalid")
;
	

}
      

}
  

}


}


