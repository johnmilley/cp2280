package ex311;
// 3.11(ModifiedAccountClass)ModifyclassAccount(Fig.3.8)to provide a method called withdraw that withdraws money from an Account. Ensure that the withdrawal amount does not exceed the Account’s balance. If it does, the balance should be left unchanged and themethodshouldprintamessageindicating"Withdrawal amount exceeded account balance."ModifyclassAccountTest (Fig. 3.9 ) to test method withdraw.

public class Account {
    private String name; // instance variable 
    private double balance; // instance variable 
 
    // Account constructor that receives two parameters  
    public Account(String name, double balance) {
       this.name = name; // assign name to instance variable name
 
       // validate that the balance is greater than 0.0; if it's not,
       // instance variable balance keeps its default initial value of 0.0
       if (balance > 0.0) { // if the balance is valid
          this.balance = balance; // assign it to instance variable balance
       }
    }
 
    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmount) {      
       if (depositAmount > 0.0) { // if the depositAmount is valid
          balance = balance + depositAmount; // add it to the balance 
       }
    }

    // Added for Exercise 3.11
    public void withdrawal(double withdrawalAmount) {
        if (withdrawalAmount > balance) {
            System.out.println("Withdrawal amount exceeds balance.");
        } else {
            balance = balance - withdrawalAmount;
        }
    }
 
    // method returns the account balance
    public double getBalance() {
       return balance; 
    } 
 
    // method that sets the name
    public void setName(String name) {
       this.name = name; 
    } 
 
    // method that returns the name
    public String getName() {
       return name; 
    } 
 }