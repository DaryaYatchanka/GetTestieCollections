import java.util.Scanner;
import java.util.stream.Stream;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    public Account(){
        this("1", 0.0, "default name", "default emailAddress", "phoneNumber");
        System.out.println("Nullary constructor");
    }

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber){

       this.number=number;
       this.balance=balance;
       this.customerName=customerName;
       this.customerEmailAddress=customerEmailAddress;
       this.customerPhoneNumber=customerPhoneNumber;

        System.out.println("parameterized constructor, overloaded");
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber) {
        this("1",99.0, customerName,customerEmailAddress,customerPhoneNumber);

    }

    public void deposit(double depositAmount){
        this.balance=balance+depositAmount;
        System.out.println("deposit of "+depositAmount +" processed. Available balance now is " +balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(withdrawalAmount>this.balance){
            System.out.println("insufficient funds");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("withdrawal of "+ withdrawalAmount+" "+"processed. Remaining balance is " +balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        System.out.println(balance);
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        System.out.println(customerName);
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
