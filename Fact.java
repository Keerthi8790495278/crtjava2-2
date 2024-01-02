 import java.util.*;

public class Fact{
	
public static void main(String[] args) {
	    
Scanner s=new Scanner(System.in);

System.out.println("enter the value of n");	    
int n,r=1;
	    
n=s.nextInt();
	    
while(n>=1)
	    
{
	     	
r=r*n;
n=n-1;																						    
}

System.out.println(r);	
	
}
}
