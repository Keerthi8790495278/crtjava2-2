class First{
	void get(int x,int y)
	{
		System.out.println(x+y);
	}
	void get(int x,int y,int z){
System.out.println(x+y+z);
	}
}
class Second extends First
{
	void get(int x,int y,int z,int j){
System.out.println(x+y+z+j);
	}
}
class Methodoverloading1
{

	public static void main(String[] args) 
	{
		Second f=new Second();
		f.get(20,40);
		f.get(9,5,67);
		f.get(8,9,4,5);
	}
}
