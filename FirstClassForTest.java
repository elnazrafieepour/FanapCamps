import java.math.BigInteger;
import java.util.Scanner;

public class FirstClassForTest {
    public static void main(String[] args){
        //دریافت ورودی از کاربر
        Scanner input= new Scanner(System.in);
        int inputNumber= input.nextInt();
        System.out.println("You Number is: " + inputNumber);
        input.close();

        System.out.println("The Factorial of your inputNumber(Methode1) is: " + getFactorial(inputNumber));
        System.out.println("The Factorial of your inputNumber(Methode2) is: " + getFactorial2(inputNumber));
        System.out.println("The Factorial of your inputNumber(Methode3) is: " + getFactorial3(inputNumber));
        System.out.println("The Factorial of your inputNumber(Methode4) is: " + getFactorial4(inputNumber));

    }
    public static long getFactorial(int Num){
        long var=1;
        int i=1;
        for (i =1; i<=Num; i++){
           var= var*i;
        }
        return var;
    }
    public static long getFactorial2(int Num){
        long var2=1;
        for(int i=0; i<Num; i++){
            var2=var2*(Num-i);
        }
        return var2;
    }
    //RecursiveMethode
    public static long getFactorial3(int Num){
        if(Num<=2)
            return Num;
        return Num*getFactorial3(Num-1);
    }
    //BigInteger
    public static BigInteger getFactorial4(int Num){
        BigInteger myVar=BigInteger.ONE;
        for(int i=1; i<=Num; i++)
            myVar=myVar.multiply(BigInteger.valueOf(i));
        return myVar;
    }
}
