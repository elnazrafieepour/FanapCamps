package FanapCamps.Account;

public abstract class  Account {
    private long balance;
    private String name;

//Constructors:
    public Account(long balance, String name){
        this.balance=balance;
        this.name=name;
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
    public abstract long soodEveryMonth ();

    public abstract long variz(long a);

    public abstract long Bardasht(long b);
}
