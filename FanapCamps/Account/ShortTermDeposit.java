package FanapCamps.Account;

public class ShortTermDeposit extends Account {
    String type= "Short";



    @Override
    public long Bardasht(long m) {
        if ((this.getBalance() - m) < 2000) {
            System.out.println("your mojoodi is not valid");
        } else {
            setBalance(this.getBalance() + m);
        }
        return getBalance();
    }

    @Override
    public long Variz (long a){
        this.setBalance(getBalance() + a);
        System.out.println("variz shod va mojoodi is: " + getBalance());
        return getBalance();
    }

    @Override
    public long soodEveryMonth() {
        long sood= (long) ((getBalance()*0.10)/12);
        System.out.println("sood in short term account is: " + this.soodEveryMonth());
        return sood;
    }

    @Override
    public void variz() {

    }

    @Override
    public void Bardasht() {

    }

    //Constructors:
    public ShortTermDeposit(long balance, String type){
        super(balance);
        this.type=type;
    }
    @Override
    public String getName(){
       String name= super.getName();
        return "owner of account is : " + name;
    }

}
