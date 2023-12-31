import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Which bank you want to open an account");
        System.out.println("Print 1 to create in Lotak and 2 to create in SBI");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        System.out.println("Enter password and initial deposit");
        String password = sc.next();
        Integer initialBalance = sc.nextInt();

        double account=Math.abs(Math.random()*Math.pow(10,9));
        String stringVersion = String.valueOf(account);

        RBI bankAccount;

        if(option==1){
            bankAccount = new LotakBank(stringVersion,password,initialBalance);
        }
        else{
            bankAccount = new SBI(stringVersion,password,(double)initialBalance);
        }


        //Inital balance : 95000

        //Withdraw money : 70000

        String result = bankAccount.witdraw(700000,"rosh123");
        System.out.println(result);

        result = bankAccount.witdraw(70000,"rosh123");
        System.out.println(result);

        //Deposit money : 70000

        result =  bankAccount.deposite(70000);
        System.out.println(result);
        System.out.println(bankAccount.checkBalance("rosh123"));


        System.out.println(bankAccount.calculateInt(3));
    }
}