
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");

//		(45 до -15.87]  с шагом 0.01
		double step = 1;
		for(double i=10-step;i>=0;i=i-step) {
			//System.out.println("i ="+i);
		}
		
		
		//создать одномерный массив 0,1,2,3,4,5,6,7,8,9 (нужно решение в общем виде для массива произвольной длинны)
		//с помощью 2-3 фор циклов распечатывать данный массив в прямом и обратном порядке, с каждой итерацией не печатая на 1 элемент с краю больше. 
		// пока не кончатся элементы
		/*
		 * 0,1,2,3,4,5,6,7,8,9      0                (arr.lengh-1)    [0 - 9]
		 * 8,7,6,5,4,3,2,1,0        (arr.lengh-1)-1     0             [8 - 0]
		 * 1,2,3,4,5,6,7,8          0+1              (arr.lengh-1)-1  [1 - 8]
		 * 7,6,5,4,3,2,1            (arr.lengh-1)-2     0+1           [7 - 1]
		 * 2,3,4,5,6,7              0+2              (arr.lengh-1)-2  [2 - 7]
		 * 6,5,4,3,2                (arr.lengh-1)-3     0+2           [6 - 2]
		 * 3,4,5,6                                                    [3 - 6]
		 * 5,4,3                                                      [5 - 3]
		 * 4,5                                                        [4 - 5]
		 * 
		 * */
		int arr[] = new int[10];
		//System.out.println(arr.length);
		
	    /**
		for (int k=0; k<=arr.length/2+1; k=k+2) {
			System.out.println("----0-----");
			for(int i =k;i<arr.length-k;i++) 
				System.out.println("["+i+"]:"+arr[i] );
			System.out.println("----1-----");
			for(int i =arr.length-1-k;i>=1+k;i--)  
				System.out.println("["+i+"]:"+arr[i] );
		}**/
		int arr1 []= new int [10];
		//[-15,-14......0.....14,15]
		/**System.out.println("----0-----");
		for(int i = 0; i<arr1.length-1;i++) {
			//arr1[i]=i;
			//System.out.println("element i="+arr1[i]);
			System.out.println("["+i+"]:"+arr[i] );
		}
		System.out.println("----1-----");
		for(int i = arr1.length-1-1; i>=0+1;i--) {
			//arr1[i]=i;
			//System.out.println("element i="+arr1[i]);
			System.out.println("["+i+"]:"+arr[i] );
		}
		System.out.println("----2-----");
		for(int i = 0+1+1; i<arr1.length-1-1;i++) {
			//arr1[i]=i;
			//System.out.println("element i="+arr1[i]);
			System.out.println("["+i+"]:"+arr[i] );
		}**/
		  
		//[0,1,2,3,4,5] [4,3,2,1] []
		for(int k=0;k<arr1.length;k= k+1) {       // от 0 до 9
			System.out.println("----обратно-----");
			for(int i = (arr1.length-1)-k; i>=0+k;i--) {   // от 9-1 до 0+1   9,8,7,6,5,4,3,2,1
				//arr1[i]=i;
				//System.out.println("element i="+arr1[i]);
				System.out.println("["+i+"]:"+arr[i] );
			}
			System.out.println("----прямо-----");
			for(int i = 0+k; i<(arr1.length-1)-k;i++) {
				//arr1[i]=i;
				//System.out.println("element i="+arr1[i]);
				System.out.println("["+i+"]:"+arr[i] );
			}
			
		}
		
		
		/**
		for(int i=-5;i<=3;i=i+2) {
			//System.out.println("Hello");
			System.out.println("внешний цикл, i="+i);
			for(int j=0;j<2;j++) {
				System.out.println(i);
				//System.out.println("Hello1");
			}
			//System.out.println("Item i is "+i);
		}**/
		
		
	//   *<=, >=, ==, !=, >, <
	}

}
