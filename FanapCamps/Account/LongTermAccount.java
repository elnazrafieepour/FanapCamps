package FanapCamps.Account;

public class LongTermAccount extends Account {
    @Override
    public long variz(long aa) {
        System.out.println("you are not allow to variz");
        return 0;
    }

    @Override
    public long Bardasht(long a) {
        System.out.println("you are not allow to Bardasht");
        return 0;
    }

    @Override
    public long soodEveryMonth() {
        long sood = (long) ((getBalance() * 0.20) / 12);
        System.out.println("sood in long term account is: " + sood);
        return sood;
    }

    //Constructors:
    public LongTermAccount(long balance) {
        super(balance);
    }
}
