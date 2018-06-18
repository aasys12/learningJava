public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailaddress;
    private String customerPhonenumber;

    public Account(){
        System.out.println("Empty Constructor called");
    }
    public Account(String number,double balance,String customerName,String customerEmailaddress,String customerPhonenumber){
        this.number=number;
        this.balance=balance;
        this.customerName=customerName;
        this.customerEmailaddress=customerEmailaddress;
        this.customerPhonenumber=customerPhonenumber;

    }

    public void deposit(double depositAmount){
        this.balance+=depositAmount;
        System.out.println("Now the available balance is: "+this.balance);
    }
    public void withdrawl(double withdrawlAmount){
        if(this.balance-withdrawlAmount<0){
            System.out.println("Only balance available "+this.balance+" only available");

        }
        else {
            this.balance-=withdrawlAmount;
            System.out.println("Withdrwal amount processesd "+withdrawlAmount);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailaddress() {
        return customerEmailaddress;
    }

    public void setCustomerEmailaddress(String customerEmailaddress) {
        this.customerEmailaddress = customerEmailaddress;
    }

    public String getCustomerPhonenumber() {
        return customerPhonenumber;
    }

    public void setCustomerPhonenumber(String customerPhonenumber) {
        this.customerPhonenumber = customerPhonenumber;
    }
}
