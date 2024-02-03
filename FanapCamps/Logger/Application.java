package FanapCamps.Logger;

public class Application {
    private Logger log;

    public Application(Logger log) {

        this.log = log;
    }

    public Application() {

    }


    public void logging(){
        this.log.logger();

    }
}
