
public class Bank {
	
	public void deposit(Account account,int amount)throws DepositException,InvalidNameException{
		if (amount<0){
			throw new DepositException("The deposit amount must be great than 0");
		}
		if(account.getName().startsWith("@")){
			throw new InvalidNameException("The character @ is not allowed.");
		}
		int newBalance=account.getBalance()+amount;
		account.setBalance(newBalance);
		
		System.out.println("Balance:"+ account.getBalance());
	}

}
