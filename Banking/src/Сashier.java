import java.util.Scanner;

public class Сashier {
    Scanner in;
	String name ="NoName";
	
	void askForNumber(Client client) {
		in = new Scanner(System.in);
		System.out.print("Input a number of credit: ");
		int sum = in.nextInt();
		in.close();
		this.give_credit(client, sum);
	}
	
	
	
	void give_credit(Client client,int sum) {//выдает кредит клиенту банка, вызывая его метод
		                                     //Issues a loan to a client of bank
		client = new Client();
		client.take_credit(sum);
		client.getAmount();
	}

}
