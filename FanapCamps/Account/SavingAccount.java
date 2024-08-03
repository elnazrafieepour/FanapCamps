package FanapCamps.Account;

public class SavingAccount extends Account{

    @Override
    public long soodEveryMonth() {
        System.out.println("sood in saving account is: 0 ");
        return 0;
    }

@Override
    public long variz(long a) {
        this.setBalance(getBalance() + a);
        System.out.println("variz shod va mojoodi is: " + getBalance());
        return getBalance();
    }

    @Override
    public long Bardasht(long b) {
        this.setBalance(getBalance() - b);
        System.out.println("bardasht shod va mojoodi is: " + getBalance());
        return getBalance();
    }

    //Constructors:
    public SavingAccount(long balance){
        super(balance);
    }
}
