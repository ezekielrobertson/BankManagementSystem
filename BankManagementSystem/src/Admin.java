public class Admin extends User{

    public Admin(String username, String password, double checking, double savings, int accountNumber) {
        super(username, password, checking, savings, accountNumber);
    }
    public void edit(int userAcctNum){
        //ideally this method will allow an admin to edit any user's info if they know their account number
    }
    public void addUser()
}
