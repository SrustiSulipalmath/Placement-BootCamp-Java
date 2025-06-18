import java.util.Scanner;

class NegativeAmountException extends Exception{
    public NegativeAmountException(String message){
        super(message);
    }
}

class InsufficientFundsException extends Exception{
    public InsufficientFundsException(String message){
        super(message);
    }
}



public class BankWithdrawl {

    public static double withdrawl(double balance,double amount) throws NegativeAmountException,InsufficientFundsException{
        if(amount <=0){
            throw new NegativeAmountException("Withdrawl amount must be greater than ");
        }
        if(amount>balance){
            throw new InsufficientFundsException("Withdrawl amount exceeds current balance");
        }

        double newBalance = balance - amount;
        System.out.println("Withdrawl successful");
        System.out.println("Remaining Balance : "+newBalance);

        return balance=newBalance;
    }

    public static double deposit(double balance,double depositAmount) throws NegativeAmountException{
         if(depositAmount <=0){
            throw new NegativeAmountException("Withdrawl amount must be greater than ");
        }

        double newBalance = balance + depositAmount;
        System.out.println("Deposit successful");
        System.out.println("New Balance : "+newBalance);

        return balance=newBalance;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter account balance");
            double balance = sc.nextDouble();

            System.out.print("Enter amount to withdraw");
            double amount = sc.nextDouble();

            balance = withdrawl(balance,amount);

            System.out.print("Enter amount to deposit");
            double depositAmount = sc.nextDouble();
            deposit(balance,depositAmount);
        } catch(NegativeAmountException nae){
            System.out.println("NegativeAnountException : "+nae.getMessage());

        }catch(InsufficientFundsException ife){
            System.out.println("InsufficientFundsException : "+ife.getMessage());
        } catch(Exception e){
            System.out.println("Something went wrong : "+e.getMessage());
        }finally{
            System.out.println("Transaction ended.");
            sc.close();
        }

    }
    
}
