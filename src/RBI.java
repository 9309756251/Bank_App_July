public interface RBI {
    public String deposite(int money);

    public String witdraw(int money, String password);

    public String checkBalance(String password);

    public Double calculateInt(int year);
}