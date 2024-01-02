import java.util.Scanner;

public class Fabinocci
{
	
public static void main(String[] args) {
	    
int i,n,n1=0,n2=1,n3 ;	    
Scanner s=new Scanner(System.in);
n=s.nextInt();
System.out.print(n1+" "+n2);
for(i=1;i<=n-2;i++)
{
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;


}	
    }
}  
 
	    

