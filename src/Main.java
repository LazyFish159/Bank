import java.util.Scanner;

public class Main {

	public static void main(String[] args)throws DepositException {
		Bank bank=new Bank();
		Account john=new Account("@John",100);

		try{
			bank.deposit(john, 50);
		}catch(DepositException e){
			e.printStackTrace();
		}catch(InvalidNameException e){
			e.printStackTrace();
		}
	}

}
