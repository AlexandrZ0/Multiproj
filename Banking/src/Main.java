import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in =  new Scanner(System.in);
		Client client = new Client();
		//Cashier cashier  = new Cashier();
		Сashier cashier = new Сashier();
	
		/*client.getAmount();
		client.take_credit(100);
		client.getAmount();*/
		System.out.print("Input a number of credit: ");
        int num = in.nextInt();
          
        //System.out.printf("Your number: %d \n", num);
        in.close();
		cashier.give_credit(client, num);

	}
	
}
