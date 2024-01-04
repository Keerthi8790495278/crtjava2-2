

public class Local
{int a=10;
static int b=20;
void show(){
    int c=30;
    	System.out.println("a=" +a);
    		System.out.println("b=" +b);
    			System.out.println("c=" +c);
    	
}
void display(){
    System.out.println("a=" +a);
    		System.out.println("b=" +b);
    			//System.out.println("c=" +c);
    	
    
}

	public static void main(String[] args) {
	    Local s1=new Local();
	   s1.show();
	   s1.display();
	   
	} 
}
