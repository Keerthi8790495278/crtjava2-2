import java.io.*;
import java.util.*;
class TestFilebufferedWriter
{
	public static void main(String[] args) throws Exception
	{FileWriter f1=new FileWriter("buffer.txt");
	BufferedWriter b1=new BufferedWriter(f1);
	b1.write('a');
	b1.nextLine();
	b1.write("keerthi");
		b1.nextLine();


		b1.write("99");

			b1.nextLine();
b1.write("html");
		b1.flush();
		b1.close();
		f1.close();
	}
}
