package FanapCamps.Account;

public abstract class  Account {
    private long balance;
    double rateInterest;
    private String name;
    static int Count=0;


//Constructors:
    public Account(long balance, String name){
        this.balance=balance;
        this.name=name;
        Count++;
    }
    public Account(long balance){
        this.balance=balance;
    }

    //getters and setters:
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setBalance(long balance){
        this.balance=balance;
    }
    public long getBalance(){
        return this.balance;
    }

    //Sood Methode:
    public double soodEveryMonth(){
        return ((this.getBalance()*this.rateInterest)/12);
    };

    public abstract long variz(long a);

    public abstract long Bardasht(long b);
}
