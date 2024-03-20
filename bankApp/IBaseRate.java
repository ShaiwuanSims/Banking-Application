package bankApp;
//Imagine another dev sets the rate or we gather the info from an API

//Interface : bringing code from outside to inside.

public interface IBaseRate {
    // Write method to return base interest rate.
    default double getBaseRate(){
        return 2.5; //benchmark rate
    }
}
