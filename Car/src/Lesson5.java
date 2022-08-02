import java.util.Random;

public class Lesson5 {

	
	public static void main(String args[]) {
		
		any_arr(6,7);
	}
	
	static void any_arr(int a,int b) {
		Random rn = new Random(); 
		int arr_double[][] = new int[a][b];
		for(int i=0;i<a;i++) {
			for(int j=0;j<b;j++) {
				arr_double[i][j] = rn.nextInt();
				System.out.print(arr_double[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	
}
