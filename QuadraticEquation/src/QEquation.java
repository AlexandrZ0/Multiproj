
public class QEquation {
	static int p;
	static int q;

	public static void main(String []args) {
		rezultForEquation(2,4,6,5);
	}
	
	static void rezultForEquation(int x, int a,int b,int c) {
		p = b/a;
		q = c/a;
		System.out.printf("p = %d, q= %d",p,q);
	}
}
