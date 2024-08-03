package FanapCamps.Account;

public class Main {
    public static void main(String[] args) {


        ShortTermDeposit aa= new ShortTermDeposit(500000);
        aa.soodEveryMonth();
        aa.Bardasht(1000);
        aa.Variz(4000);

        LongTermAccount bb= new LongTermAccount(10);
        aa.soodEveryMonth();
        aa.Bardasht(1000);
        aa.Variz(4000);

        SavingAccount zz= new SavingAccount(2000000);
        aa.soodEveryMonth();
        aa.Bardasht(1500000);
        aa.Variz(510000);
    }
}
