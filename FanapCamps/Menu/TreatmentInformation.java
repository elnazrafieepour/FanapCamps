package FanapCamps.Menu;

public class TreatmentInformation {
    String remedyHistory;
    String drugHistory;
    String duration;

    //Constructors:
    public TreatmentInformation(String remedyHistory, String drugHistory, String duration) {
        this.remedyHistory = remedyHistory;
        this.drugHistory = drugHistory;
        this.duration = duration;
    }

    public TreatmentInformation(String drugHistory) {
        this.drugHistory = drugHistory;
    }

    //Getters:
    public String getRemedyHistory() {
        return remedyHistory;
    }

    public String getDrugHistory() {
        return drugHistory;
    }

    public String getDuration() {
        return duration;
    }

    @Override
    public String toString(){
        return "نمایش سابقه درمانی بیمار: {" +
                "سابقه بیماری:'" + this.remedyHistory + '\'' +
                ", مصرف دارو:" + this.drugHistory + '\'' +
                ", مدت مصرف دارو:" + this.duration +
                '}';
    }
}
