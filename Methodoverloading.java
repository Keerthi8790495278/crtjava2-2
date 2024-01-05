class First{
	void get(int x)
	{
		System.out.println("one arg int type");
	}
	void get(int x,int y){
System.out.println("two arg int type");
	}
	void get(double x,double y){
System.out.println("two arg float type");
	}
}
class Methodoverloading
{

	public static void main(String[] args) 
	{
		First f=new First();
		f.get(10);
		f.get(20,40);
		f.get(8.9,7.7);
	}
}
