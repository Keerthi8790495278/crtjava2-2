import java.util.*;
class  Arraysum{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int m,n,i,j,a[][],sum=0;
			System.out.println("enter num of rows and columns");
			m=s.nextInt();
			n=s.nextInt();
			a=new int[m][n];
		System.out.println("enter elements");

		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
	a[i][j]=s.nextInt();
			}
			}
		System.out.println("matrix is");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
			    	
			    	sum=sum+a[i][j];
			}
				
	}
	System.out.println(sum);
}
}
