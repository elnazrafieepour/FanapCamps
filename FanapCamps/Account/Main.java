package FanapCamps.Account;

public class Main {
    public static void main(String[] args) {


        ShortTermDeposit aa= new ShortTermDeposit(500000, "Eli1");
        aa.soodEveryMonth();
        aa.variz(4000);
        aa.Bardasht(1000);


        SavingAccount zz= new SavingAccount(2000000, "Eli2");
        zz.soodEveryMonth();
        zz.Bardasht(1500000);
        zz.variz(510000);


        LongTermAccount bb= new LongTermAccount(1000000, "Eli2");
        bb.soodEveryMonth();
        bb.Bardasht(1000);
        bb.variz(4000);


        Account[] accountList= new Account[Account.Count];
        accountList[0]= aa;
        accountList[1]= bb;
        accountList[2]= zz;

        for (Account account: accountList){
            account.soodEveryMonth();
        }

    }
}
