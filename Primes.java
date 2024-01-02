import java.util.Scanner;

public class Prime
{
	
public static void main(String[] args) {
	    
int i,n,c=0;
	    
Scanner s=new Scanner(System.in);
	   
 n=s.nextInt();
	   
 for(i=1;i<=n;i++)
	    
{if(n%i==0)
	    
c=c+1;
	   
 }
	    
{if(c==2)
		
System.out.println(n+"is a prime number");
		
else
			
System.out.println(n+"is a not prime number");
	
      }}
}
