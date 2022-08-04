
public class Client {
   
	
	String name="NoName";
	//float count;
	Count count = new Count();
	
	void take_credit(int value) {
		count.change_amount(value);
	}
	
	void getAmount () {
		System.out.println(count.amount);
	}

}
