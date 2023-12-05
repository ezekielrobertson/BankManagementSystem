public class User{
    public String username;
    public String password;
    public double checking;
    public double savings;
    public int accountNumber;

    public User(String username, String password, double checking, double savings, int accountNumber) {
        this.username = username;
        this.password = password;
        this.checking = checking;
        this.savings = savings;
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getSavings() {
        return savings;
    }

    public void setSavings(double savings) {
        this.savings = savings;
    }

    public double getChecking() {
        return checking;
    }

    public void setChecking(double checking) {
        this.checking = checking;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void depositChecking(double amount){
        //this method will allow a user to deposit money into their checking account
        checking += amount;
    }

    public void depositSavings(double amount){
        //this method will allow a user to deposit money into their savings account
        savings += amount;
    }
    public void withdraw(double request) {
        //this method will allow a user to take a set amount (variable request) out of their checking account
        if ((checking - request) > 0) {
            checking += request;
        }
    }
    public void moveToSavings(double amount){
        //this method will allow a user to move an amount of money in their checking
        //account into their savings account
        if ((checking - amount) > 0 && checking != 0.00){
            checking -= amount;
            savings += amount;
        }
    }
    public void moveToChecking(double amount){
        //this method will allow a user to move an amount of money in their savings
        //account into their checking account
        double minimumBalance = 5.00;
        if ((savings - amount) > minimumBalance && savings != 0.00){
            savings -= amount;
            checking += amount;
        }
    }
    public void send(double amount, int userAccountNumber){
        //the idea here is that a user can send another user money if they know their account number
        //i.e. input an account number, subtract money from your checking, add it to the other users checking
        //need to find a way to link this to the registered_users directory
        //this might be the wrong place to do it
    }
}
