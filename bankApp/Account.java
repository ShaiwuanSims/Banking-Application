package bankApp;
//Parent Class
//Abstact - unable to create objects from class but able to create objects that inherit class
public abstract class Account implements IBaseRate {
    //list common properties for savings and checking account
     private String name;
     private String sSN;
     private String accountType;
    private double balance;
    double initDeposit;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;



    //Constructor to set base properties and initialize account
    public Account(String name, String sSN, double initDeposit){
    this.name = name;
    this.sSN = sSN;
    balance = initDeposit;
    //System.out.println("Name: " + name + "\nSSN: " + sSN + "\nBALANCE: " + balance);

    this.accountNumber = setAccountNumber();
    setRate();
    }


    //set Account Number
    private String setAccountNumber(){
        String lastTwoSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNum = (int) (Math.random() * Math.pow(10,3)); // generate random 3 digit num

        return lastTwoSSN + uniqueID + randomNum;
    }
    public void compound(){
        double accrudeInterest = balance * (rate/100);
        balance = balance + accrudeInterest;
        System.out.println("ACCRUDE INTEREST : $" + accrudeInterest);
        printBalance();
    }
    public void showInfo(){
        System.out.println("NAME: " + name +
                "\nACCOUNT NUMBER: " + accountNumber +
                "\nBALANCE: " + balance +
                "\nRATE : " + rate + "%"
        );

    }

    public abstract void setRate();

    //list Common Methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance(){
        System.out.println("Your balance is now : $" + balance);
    }
}
