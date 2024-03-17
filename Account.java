import java.time.LocalDate;

public class Account {
    int value = 0;
    String account_name;
    String currency;
    LocalDate Date = LocalDate.now(); 
public void Check_Amount(){
    System.out.println("Your name:" + account_name);
    System.out.println("Account value:"+ value + currency);
    System.out.println("Date:" + Date);
}


public int Deposite(int number)
{
    value = value + number;
    return value;
    }

public int Withdraw(int number){

    if  ((value>0)&&(value>number)){
      value = value - number;

    }
    else {
      System.out.println("The amount you request exceeds your bank account.");

    }
   return value;
}    
}
