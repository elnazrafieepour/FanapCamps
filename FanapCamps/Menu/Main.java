package FanapCamps.Menu;

import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("لطفا اطلاعات دموگرافیگ خود را وارد نمائید: ");
        System.out.print("نام: ");
        String name = scanner.nextLine();
        System.out.print("نام خانوادگی: ");
        String lastname = scanner.nextLine();
        System.out.print("سن: ");
        String Age = scanner.nextLine();
        Demographic demographic= new Demographic(name, lastname, Age);
        System.out.println(demographic.toString());

        System.out.println("لطفا تاریخچه درمانی خود را وارد نمائید: ");
        System.out.print("تاریخچه درمانی: ");
        String remedyHistory = scanner.nextLine();
        System.out.print("مصرف دارو: ");
        String drugHistory = scanner.nextLine();
        System.out.print("مدت زمان مصرف: ");
        String duration = scanner.nextLine();
        TreatmentInformation TreatmentInformation= new TreatmentInformation(remedyHistory, drugHistory, duration);
        System.out.println(TreatmentInformation.toString());


        System.out.println("لطفا نوبت خود را وارد نمائید: ");
        System.out.print("تخصص: ");
        String Specialist = scanner.nextLine();
        System.out.print("نام پزشک: ");
        String Medico = scanner.nextLine();
        System.out.print("تاریخ نوبت: ");
        String date = scanner.nextLine();
        visitRequest visitRequest= new visitRequest(Specialist, Medico, date);
        System.out.println(visitRequest);


    }
}
