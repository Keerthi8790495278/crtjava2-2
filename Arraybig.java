import java.util.Scanner;
public class Arraybig      {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int a[],i,n,big;

n=s.nextInt();
a=new int[n];

for(i=0;i<n;i++)
	{		
a[i]=s.nextInt();
	}
	big=a[0];
	for(i=0;i<n;i++)
	{	if(big<a[i])
		big=a[i];
	}

	System.out.println("the biggest value is" +big);

	}
}
