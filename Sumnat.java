import java.util.Scanner;
class Sumnat 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i,n,temp=0;
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{ 
			temp=temp+i;
		}
		System.out.println(temp);
	}
}
