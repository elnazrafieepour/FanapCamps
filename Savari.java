public class Savari extends Machin {
    private String type = "Savari";
    private int wheelCount = 4;
    private boolean Automatic=false;


    //set the Number of WheelCount:
    public void setWheelCount(int wheelCount) {
        this.wheelCount = wheelCount;
    }
    public int getWheelCount() {
        return wheelCount;
    }
    public String getType() {
        return type;
    }
    @Override
    public void driving() {
        System.out.println("Payeh1");
    }


}
