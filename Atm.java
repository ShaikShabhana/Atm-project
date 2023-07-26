import java.util.*;
 class Atm
{
 public static void main(String[] args)
 { 
   int pin = 9490;
   int balance = 7000;
   int depositamount = 0;
   int withdrawal = 0;
   int transferAmount=500;
   int account1Balance=1000;
   int account2Balance=500;
   String name;
   ArrayList<String>transactionHistory=new ArrayList<>();
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter your pin number");
   int password = obj.nextInt();
  if(password==pin)
 {
   System.out.println("Enter your name");
   name = obj.next();
   System.out.println("welcome" + name);

  while(true)
 {
   System.out.println("press 1 to show transaction history");
   System.out.println("press 2 to deposit Money");
   System.out.println("press 3 to withdraw Money");
   System.out.println("press 4 to view balance");
   System.out.println("press 5 to transfer Amount");
   System.out.println("Enter any number to EXIT");

   int opt = obj.nextInt();
  switch(opt)
 {
   case 1:
    if(!transactionHistory.isEmpty()) {
                            System.out.println("Transaction history:");
                            for (String transaction : transactionHistory) {
                                System.out.println(transaction);
                            }
                        } else {
                            System.out.println("Transaction history is empty");
                        }
                        break;
   case 2:
   System.out.println("How much amount did you want to deposit to your account");
   depositamount=obj.nextInt();
   System.out.println("Successfully deposited");
   balance = depositamount + balance;
   break;
   case 3:
   System.out.println("How much amount did you want to withdrawal");
   withdrawal= obj.nextInt();
 if(withdrawal>balance)
{
	System.out.println("your balance is insufficient");
	System.out.println("try less than your available balance");
}
 else
{
	System.out.println("successfully withdrawal");
	balance = balance - withdrawal;
}	
	break;
   case 4:
   System.out.println("your current balance is" + balance);
   break;
   case 5:
            if (transferAmount > 0 && transferAmount <= account1Balance) {
            account1Balance -= transferAmount;
            account2Balance += transferAmount;
            System.out.println("Transfer successful.");
            System.out.println("Account 1 balance: " + account1Balance);
            System.out.println("Account 2 balance: " + account2Balance);
            }
         else {
            System.out.println("Invalid transfer amount or insufficient funds.");
        }
     break;
default:	
        System.out.println("Thank you");
	break;
}
}
}else{
	 System.out.println("wrong pin number");
   }
  }
}