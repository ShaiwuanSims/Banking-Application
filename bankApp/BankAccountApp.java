package bankApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args){
        List<Account> accounts = new LinkedList<Account>();


        String file = "src/bankApp/customerEntries";

    List<String[]> newAcctHolders = utilities.CSV.read(file);
    for(String[] accountHolder : newAcctHolders){
        String name = accountHolder[0];
        String sSN = accountHolder[1];
        String accountType = accountHolder[2];
        double initDeposit = Double.parseDouble(accountHolder[3]);
        //System.out.println(name + " " + " " + sSN + " " + accountType + " " + " $" + initDeposit);
        if(accountType.equals("Savings")){
            //System.out.println("OPEN A SAVINGS ACCOUNT");
            accounts.add(new Savings(name,sSN,initDeposit));
        } else if (accountType.equals("Checkings")) {
            //System.out.println("OPEN A CHECKING ACCOUNT");
            accounts.add(new Checking(name,sSN,initDeposit));
        }
        else{
            System.out.println("ERROR : NO ACCOUNT TYPE FOUND");
        }
    }

    for (Account acc : accounts){
        System.out.print("\n************");
        acc.showInfo();
    }

    }
}
