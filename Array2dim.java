import java.util.*;
class  Array2dim{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int a[][]={{2,3},{4,5}},i,j;
		System.out.println("matrix is");
		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				System.out.print(a[i][j]+"  ");
			}
					System.out.println(" ");
		}
	}
}
