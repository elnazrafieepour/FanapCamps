package FanapCamps.Account;

public class ShortTermDeposit extends Account {

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
    public long soodEveryMonth() {
        long sood= (long) ((getBalance()*0.10)/12);
        System.out.println("sood in short term account is: " + sood);
        return sood;
    }


    //Constructors:
    public ShortTermDeposit(long balance){
        super(balance);
    }
    @Override
    public String getName(){
       String name= super.getName();
        return "owner of account is : " + name;
    }

}
