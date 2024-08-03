package FanapCamps.Account;

public class SavingAccount extends Account{

    @Override
    public long soodEveryMonth() {
        long sood= 0;
        System.out.println("sood in short term account is: " + this.soodEveryMonth());
        return sood;
    }

    @Override
    public void variz() {

    }

    @Override
    public void Bardasht() {

    }

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
    public void SavingAccount(){
        this.
    }
}
