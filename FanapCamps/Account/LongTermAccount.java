package FanapCamps.Account;

public class LongTermAccount extends Account {
    final int Duration = 12;

    @Override
    public long variz(long aa) {
        System.out.println("you are not allow to variz");
        return this.getBalance();
    }

    @Override
    public long Bardasht(long a) {
        System.out.println("you are not allow to Bardasht");
        return this.getBalance();
    }

    @Override
    public double soodEveryMonth() {
        System.out.println("sood in long term account is: " + super.soodEveryMonth());
        return super.soodEveryMonth();
    }

    //Constructors:
    public LongTermAccount(long balance, String name) {
        super(balance, name);
        super.rateInterest=0.20;
    }
}
