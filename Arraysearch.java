import java.util.*;
public class Arraysearch      {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int a[],i,n,sno;
n=s.nextInt();
a=new int[n];
for(i=0;i<n;i++)
	{		
a[i]=s.nextInt();
	}
	System.out.println("ENTER ELEMENT TO SEARCH");
	sno=s.nextInt();
		int r=Arrays.binarySearch(a,sno);
	if(r<0)
	{System.out.println("element not found");
	}
	else
	{
		System.out.println("element found at position" +(r+1));
	}
}
}