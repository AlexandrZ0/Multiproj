import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;


public class Lesson4 {

	List<String> list = new LinkedList<String>();
	List<Integer> numbers = new LinkedList<>();
	
	//List<LinkedList<Integer>,LinkedList<Integer>> commonList = new LinkedList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Lesson4 lesson4 = new Lesson4();
        //Collections.addAll(lesson4.list, "yyy","jjj","uuyu");
        //System.out.println(lesson4.list);
        
        Integer[]arrNums = new Integer[] {1,3,4,6,45};
        
        for(int i:arrNums) {
        	//System.out.println(i);
        }
        
        for(String i:lesson4.list) {
        	//System.out.println(i);
        }
        Collections.addAll(lesson4.numbers, arrNums);
        for(int i:lesson4.numbers) {
        	System.out.println(i);
        }
        
        List<Integer> nums = Arrays.asList(1, 2, 3);
        List<String> strings = nums.stream()
            .map(Object::toString)
            .collect(Collectors.toList());
        
        for(String i: strings) {
        	System.out.println(i);
        }
	}

}
