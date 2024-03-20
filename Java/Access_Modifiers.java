class Account{
    //1.public
    public String name;

    //2.Default
    String surname;

    //3.Protected - this can only access in other packages by sub-classes only and anyone can access in the current package
    protected String email;

    //4.Private - Outside the class(Account) no one can access
    private String password;
    //can be access by getters and setters
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}
public class Access_Modifiers{
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Kashish";
        account1.surname = "Rathore";
        account1.email = "kashishrathore@gmail.com";
        // account1.password = "abcd";  shows error as can not access account private elemnt to Access_Modifiers
        account1.setPassword("abcd");
        System.out.println(account1.getPassword());
    }
}
