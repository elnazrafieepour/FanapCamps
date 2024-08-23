package FanapCamps.Account;

public class ShortTermDeposit extends Account {

    final double rateInterest= 0.10;

    @Override
    public long Bardasht(long m) {
        if ((this.getBalance() - m) < 2000) {
            System.out.println("your mojoodi is not valid");
        } else {
            setBalance(this.getBalance() - m);
            System.out.println("bardasht shod va mojoodi is: " + getBalance());
        }
        return getBalance();
    }

    @Override
    public long variz (long a){
        this.setBalance(getBalance() + a);
        System.out.println("variz shod va mojoodi is: " + getBalance());
        return getBalance();
    }

    @Override
    public double soodEveryMonth() {
        System.out.println("sood in short term account is: " + super.soodEveryMonth());
        return super.soodEveryMonth();
    }


    //Constructors:
    public ShortTermDeposit(long balance, String name){
        super(balance, name);
        super.rateInterest=0.10;
    }
    @Override
    public String getName(){
       String name= super.getName();
        return "owner of account is : " + name;
    }

}
