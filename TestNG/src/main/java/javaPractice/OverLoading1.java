package javaPractice;

public class OverLoading1 {
	public void m1(String s) {
		System.out.println("String version");
	}
	public void m1(Object o ) {
		System.out.println("Objct version");
	}

	public static void main(String[] args) {
		OverLoading1 obj=new OverLoading1();
		obj.m1("sunil");
		obj.m1(new Object());
		obj.m1(null);// here null is valid for both String and Object clASS SO Here compiler always give precedence for Child compared to 	parent
	

	}

}
