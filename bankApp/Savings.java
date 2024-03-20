package bankApp;

public class Savings extends Account{
    //list properties specific to savings
    int safetyDepositBoxID;
    int safetyDepositBoxKey;
    //setSafetyDepositBox

    //getSafetyDepositBox

    //Constructor to initialize settings for savings
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();
    }

    public void setRate(){
        rate = getBaseRate() - .25;
    }

    //List methods
    public void showInfo(){
        System.out.println("ACCOUNT TYPE : SAVINGS");
        super.showInfo();
        System.out.println(
                "Your Savings Account Features " +
                        "\nSafety Deposit Box ID : " + safetyDepositBoxID +
                        "\nSaftey Deposit Box Key : " + safetyDepositBoxKey
                );
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
        //System.out.println("SAFETY DEPOSIT BOX ID : " + safetyDepositBoxID);
    }
}
