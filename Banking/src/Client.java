
public class Client {
   
	
	String name;
	//float count;
	Count count = new Count();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void take_credit(int value) {
		//count = new Count();
		count.change_amount(value);
		//count = count + value;
	}
	
	void getAmount () {
		System.out.println(count.amount);
	}

}
