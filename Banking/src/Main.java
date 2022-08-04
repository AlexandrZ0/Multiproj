
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client client = new Client();
		//Cashier cashier  = new Cashier();
		Сashier cashier = new Сashier();
	
		/*client.getAmount();
		client.take_credit(100);
		client.getAmount();*/
		
		cashier.give_credit(client, 1000);

	}
	
}
