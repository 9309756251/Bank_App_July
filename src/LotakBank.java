public class LotakBank implements RBI
{

    private String account;
    private String password;
    private Integer balance;
    private Integer minBalance=500;
    private double rateOfInt=7.5;

    public LotakBank(String account, String password, Integer balance) {
        this.account = account;
        this.password = password;
        this.balance = balance;
    }

    public String deposite(int money)
    {
        if(money>0){
            balance = balance + money;
            return "Money :"+money+" has been added to your account. Total " +
                    "balance is"+balance;
        }
        else{
            return "Money entered is negative";
        }
    }

    public String witdraw(int money, String password)
    {
        if(password.equals(this.password)){
            if(balance>=money){
                balance = balance - money;
                return "Money :"+money+" has been withdrawn. Remaining balance is "+balance;

            }else{
                return "Inti Dhanrashi nhi hai Bank Account Mein";
            }

        }else{

            return "Wrong password entered";
        }
    }

    public String checkBalance(String password)
    {
        if(this.password.equals(password)){
            return "The balance is "+this.balance;
        }else{
            return "Wrong password entered";
        }
    }

    public Double calculateInt(int year)
    {
        Double simpleInterest = (balance*year*rateOfInt)/100;

        return simpleInterest;
    }
}
