package FanapCamps.Account;

public abstract class  Account {
    private long balance;
    private long sood;
    private String name;
    private float darsadSood;

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
    public void setDarsadSood(float d){
        this.darsadSood=d;
    }
    public float getDarsadSood(){
        return this.darsadSood;
    }
    public void setBalance(long balance){
        this.balance=balance;
    }
    public long getBalance(){
        return this.balance;
    }

    //variz Methode:
    public long Variz (long a){
        this.balance=balance+a;
        System.out.println("variz shod va mojoodi is: " + balance);
        return balance;
    }
    //Bardasht Methode:
    public long Bardasht (long b){
        this.balance=balance-b;
        System.out.println("bardasht shod va mojoodi is: " + balance);
        return balance;
    }
    //Sood Methode:
    public long soodEveryMonth (){
        this.sood= (long) ((balance*0.20)/12);
        System.out.println("sood is: " + balance);
        return sood;
    }

    public abstract void variz();

    public abstract void Bardasht();
}
