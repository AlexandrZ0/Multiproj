import java.util.ArrayList;
import java.util.Collections;
public class Fifo {
    
	ArrayList<Integer> arrlist = new ArrayList<>();
	
	
	public static void main(String[] args) {
		Fifo fifo = new Fifo();
		//fifo.fifo(10);
		
		
		//fifo.mathRandom();
		fifo.one_hundred_fifo_calls();

	}
    
	void fifo(int chislo) {
		if(arrlist.size()>7) {
			arrlist.remove(0);
		}
		arrlist.add(chislo);
		
		System.out.print(arrlist);
		System.out.print(" => ");
		Collections.sort(arrlist);
		System.out.print(arrlist);
		if(arrlist.size() == 8) {
			/*int for_first_elem = arrlist.size()/2;
			int first_index = arrlist.get(for_first_elem);
			int second_index = arrlist.get(first_index+1);
			double median = (first_index + second_index)/2;
			
			System.out.print(" => ");
			System.out.println(median);*/
			int first_elem = arrlist.get(arrlist.size()/2);
			int second_elem = arrlist.get((arrlist.size()/2)+1);
			double median = (first_elem + second_elem)/2;
			System.out.print(" => ");
			System.out.println(median);
		}
	}
	
	
	
	
	
	void one_hundred_fifo_calls() {
		int a = 0;
		int b = 10;
		for(int i=0;i<100;i++) {
			int rand_num =a + (int)(Math.random()*b);
			this.fifo(rand_num);
		}
	}
}
