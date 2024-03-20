package bankApp;

public class Checking extends Account {
    //list properties specific to checkings
    //Debit card
    private int debitCardNum;
    private int debitCardPin;
    //Pin of debit car
    //2 in front of account number

    //Constructor
    public Checking(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit); //pass properties to super constructor
        accountNumber = "2" + accountNumber;
        //System.out.println("NAME : " + name);
        setDebitCardNum();
    }

    public void setRate(){
        rate =  getBaseRate() * .15;
    }

    public void showInfo(){
        super.showInfo();
        System.out.println("Checkings Account Features : " +
                "\nDebit Card Number : " + debitCardNum  +
                "\nDebit Card Pin : " + debitCardPin
        );


    }


    private void setDebitCardNum() {
        debitCardNum = (int)(Math.random() * Math.pow(10,12));
        debitCardPin = (int)(Math.random() * Math.pow(10,4));
    }
}
