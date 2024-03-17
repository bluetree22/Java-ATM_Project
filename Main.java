import java.util.Scanner;


public class Main {
    
public static void main(String[] args)
{

    Scanner Input = new Scanner(System.in);
    Account Bank_acc = new Account();
    System.out.println("Enter your name");
    String First_account = Input.nextLine();
    
    System.out.println("Choose a currency");
    String currency = Input.nextLine();
    Bank_acc.currency = currency;

    Bank_acc.account_name = First_account;
    
    System.out.println("Enter an amount to start with.");
    int amount = Input.nextInt();
    Bank_acc.Deposite(amount);
    
    
    Scanner Input2 = new Scanner(System.in);
    
    while (true){
        
    System.out.println("'d' for deposite, 'w' for withdraws or 'c' for account check or 'x' to exit");
        String action = Input2.nextLine();    
    if (action.contains("d")){
        System.out.println("Please introduce the amount you wish to deposite.");
        int deposite = Input2.nextInt();
        Bank_acc.Deposite(deposite);
        
    }
    else if (action.contains("w")){
        System.out.println("Please introduce the amount you wish to withdraw");
        int withdraw = Input2.nextInt(); 
        Bank_acc.Withdraw(withdraw);
    }

    else if (action.contains("c"))
    {
       System.out.println("Bank Account info accessed.");
       Bank_acc.Check_Amount();;
    }  
    
    else if (action.contains("x")){
        System.out.println("Operations closed. Have a nice day!");
          break;

    }
     
}
}
}
    



