import java.util.Scanner;
public class Array3      {

public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
int a[],i,n,sum=0;
float avg;
n=s.nextInt();
a=new int[n];

for(i=0;i<n;i++)
	{		
a[i]=s.nextInt();
	}
	for(i=0;i<n;i++)
	{	sum=sum+a[i];
	}
	avg=(float)sum/n;
	System.out.println("sum is" +sum);
	System.out.println("avg is" +avg);
	}
}
