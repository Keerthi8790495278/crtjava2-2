import java.util.*;


 

public class EvenOdd
{
  
 


public static void main (String[]args)
  

{
    
 


Scanner s = new Scanner (System.in);
    
 


System.out.println ("enter the value of n");
    


int n, temp, r, d = 0,e=0;
    

    
 


n = s.nextInt ();
temp = n;
    
 


while (n > 0)
      
 
      

{
	
 


r = n % 10;
	


n = n / 10;

if(r%2==0)
	
 


{d = d + r;

       


}
 

else
{

e=e+r;

 
}}

System.out.println (d);  
 

System.out.println (e);
   

   
 


}

}





 