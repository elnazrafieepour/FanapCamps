package FanapCamps.Menu;

import java.util.Date;

public class visitRequest {
    String Specialist;
    String Medico;
    String date;

    //Constructor:
    public visitRequest(String specialist, String medico, String date) {
        Specialist = specialist;
        Medico = medico;
        this.date = date;
    }

    //Getters:
    public String getSpecialist() {
        return Specialist;
    }

    public String getMedico() {
        return Medico;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString(){
        return "نوبت شما با اطلاعات : {" +
                "تخصص:'" + this.Specialist + '\'' +
                ", نام پزشک:" + this.Medico + '\'' +
                ", تاریخ نوبت:" + this.date +
                '}' +
                "اخذ شذ.";
    }
}
