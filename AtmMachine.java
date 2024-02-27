/**
 * AtmMachine
 */

import java.util.Scanner;

/**
  * Atm
  */
  class Atm {

    float balance ;
    int PIN = 6575;

    public  void checkPin() {

      System.out.println("Enter your PIN Number");
      Scanner sc = new Scanner(System.in);
      int enteredPin = sc.nextInt();
      if(enteredPin == PIN){
          menu();
      }
      else{
        System.out.println("Invalid PIN try again...");
      }
      sc.close();
    }

        

      public void menu(){
        System.out.println("Enter Your Choice");
        System.err.println("1.Check your A/C Balance");
        System.err.println("2.Withdraw Amount");
        System.out.println("3.Deposit Amount");
        System.out.println("4.EXIT");


        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if(opt == 1)
        {
          checkBalance();
        }

        else if(opt == 2 )
        {
            WithdrawAmount();
        }
        
        else if(opt == 3)
        {
          depositAmount();
        }

        else if( opt == 4)
        {
                return;
                
        }
        
        else{
          System.out.println("enter valid option");
        }
        sc.close();
      }
    
      

      public void checkBalance()
      {
        System.out.println(" Balance " +balance);
        menu();

      }


      public void WithdrawAmount(){
        System.out.println("enter amount to withdraw");
        Scanner sc =  new Scanner(System.in);
        float amount = sc.nextFloat();
        if (balance < amount) {
          System.out.println("Insufficient balance to withdraw");
        
        }
        else{
          balance = balance-amount;
          System.out.println("Amount is withdrawed Sucessfully..!" +balance);
          menu();
  
        }
        sc.close();
        
      }


      public void depositAmount()
      {
         System.out.println("Enter the amount to deposit");
         Scanner sc = new Scanner(System.in);
         float amount = sc.nextFloat();

         balance = balance + amount;
         System.out.println(" Amount deposited Successfully  " +balance);
         menu();
         sc.close();

      }
      

      
  
}



public class AtmMachine {

public static void main(String[] args) {
Atm atm = new Atm();
atm.checkPin();
  
}

  

  
}