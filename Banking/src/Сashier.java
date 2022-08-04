
public class Сashier {
    
	String name ="NoName";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	void give_credit(Client client,int sum) {//выдает кредит клиенту банка, вызывая его метод
		                                     //Issues a loan to a client of bank
		client = new Client();
		client.take_credit(sum);
		client.getAmount();
	}

}
