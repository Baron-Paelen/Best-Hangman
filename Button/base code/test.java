package Button;
import pkg.*;
public class test{
	
	public static void main(String args[])
	{
		ButtonRunnable<String> r = test::tryThis;
		Button<String> b = new Button<String>(100, 150, 80, 60, new Color(0, 135, 255), new Color(40, 154, 255));
		b.addMethod(r, "pee");
		b.draw();
	}
	
	public static void tryOnClickC(String... a)
	{
		if(a.length > 0)
			System.out.println(a[0].substring(0, 2));
	}
	
	public void tryThis(String... a)
	{
		for(String s : a)
			System.out.print(s + " ");
		System.out.println();
	}	
}

