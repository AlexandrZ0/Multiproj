import java.util.Scanner;

public class Lesson1 {
    
	//Scanner scanner;
	static int row;
	int column;
	String symble;
	
	public void rowInput() {
		//Scanner scanner = new Scanner(System.in);
		
		   Scanner scanner = new Scanner(System.in);
		   int row = scanner.nextInt();
		   for(int i=0;i<row;i++) {
				System.out.println("value is "+i);
		   }
		
		   scanner.close();
		
		//row = scanner.nextInt(arg);
		//System.out.println("rowInput is running");
	}
	
	public static void main(String[]args) {
		Lesson1 lesson1 = new Lesson1();
		lesson1.rowInput();
		//Scanner scanner = new Scanner(System.in);
		//int age = scanner.nextInt();
		//System.out.println(age);
		
		
	}
	
	/*public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input age: ");
        int age = in.nextInt();
        System.out.print("Input height: ");
        float height = in.nextFloat();
        System.out.printf("Name: %s  Age: %d  Height: %.2f \n", name, age, height);
        in.close();
    }*/
}
