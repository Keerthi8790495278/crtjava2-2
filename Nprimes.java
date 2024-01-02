import java.util.Scanner;

public class Nprimes

{
	
public static void main(String[] args) {
	    
int i,n,c=0,j;
i=1;
	    
Scanner s=new Scanner(System.in);
	   
 n=s.nextInt();
	   
 for(;;)
	    
{for(j=2;j<i;j++)
{
if(i%j==0)
{	    
break;  
 }}
if(j==i)	    		
{System.out.println(i+" ");

}
			
 }}}

