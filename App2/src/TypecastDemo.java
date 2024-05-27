
public class TypecastDemo {

	public static void main(String[] args) {
		
		//byte, short, int ,long,float,double
		//char,boolean 
		int a=10;
		
		double b=a; //typecast int - double  widending , implicit
		System.out.println(a + "  "+b);
		
		float f=98324.324f;
		int i=(int)f; //explicit, narrowing , higher - lower 
		
		System.out.println(f+  "  "+ i);
		
	}

}
