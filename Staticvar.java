

public class Staticvar
{int a=10;
static int b=20;

	public static void main(String[] args) {
	    Staticvar s1=new Staticvar();
	    Staticvar s2=new Staticvar();
		System.out.println(s1.a+ " "+s1.b);
		System.out.println(s2.a+ " "+s2.b);
		s1.a=88;
		s1.b=99;
			System.out.println(s1.a+ " "+s1.b);
		System.out.println(s2.a+ " "+s2.b);
	} 
}
