import java.util.*;
public class Arraysort      {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int a[],i,n;
n=s.nextInt();
a=new int[n];
for(i=0;i<n;i++)
	{		
a[i]=s.nextInt();
	}
	System.out.println("the values before sorting");
	for(i=0;i<n;i++)
	{System.out.print(a[i]+ " ");
	    
	}
Arrays.sort(a);
for(i=0;i<n;i++)
	{		

System.out.println("the values after sorting");
	for(i=0;i<n;i++)
	{System.out.print(a[i]+ " ") ;
	    
	}
}
}}