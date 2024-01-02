import java.util.Scanner;
class Table
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int i,n;
		n=s.nextInt();
		for(i=1;i<=10;i++)
		{ 
		 System.out.println(i+"*"+n+"="+i*n); 
		}
	}
}
