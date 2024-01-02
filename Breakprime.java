import java.util.Scanner;
class Breakprime{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
   
int i,n;
 n=s.nextInt();
for(i=2;i<=n;i++)
{if(n%i==0)
break;
}
if(i==n)
{System.out.println("prime");
}
else
{System.out.println("not a prime");
}
}}