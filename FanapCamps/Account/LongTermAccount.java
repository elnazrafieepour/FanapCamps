package FanapCamps.Account;

public class LongTermAccount extends Account{
     @Override
    public void variz(){
         System.out.println("you are not allow to variz");
     }
    @Override
    public void Bardasht(){
        System.out.println("you are not allow to Bardasht");
    }

    @Override
    public long soodEveryMonth(){
        long sood= (long) ((getBalance()*0.20)/12);
        System.out.println("sood in short term account is: " + this.soodEveryMonth());
        return sood;
    }
}
