import java.util.*;


 
public class Reverse

{
  
 
 
 
 

public static void main (String[]args)
 
 

  {
    
 
 
 
 

Scanner s = new Scanner (System.in);
    
 
 
 
 

System.out.println ("enter the value of n");
    
 
 
 

int n, temp, r=0, d ;
    
 
 
 
 
 
 

n = s.nextInt ();
    
 

temp = n;
    
 
 
 
 

while (n > 0)
      
 
 
 
 
      
{
	
 
 
 
 

d= n % 10;
	
 
 
 

n = n / 10;
	
 

r = r * 10 + d;
      

}
    
 

System.out.println (r);
  
 
 
 
 
 
 
 
 
 

}

 
}


 
 
 
 
 
