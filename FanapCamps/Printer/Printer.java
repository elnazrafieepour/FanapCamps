package FanapCamps.Printer;

public class Printer {
    private int tonerLevel;
    private int pagePrinted;
    private boolean duplex;

    //Define Printer(Constructor):
    public Printer(int tonerLevel, boolean duplex) {
        this.duplex = duplex;
        this.pagePrinted = 0;
        if (tonerLevel > -1 && tonerLevel < 100)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
    }

    //Add Toner to Printer:
    public int addToner(int addAmount) {
        if (addAmount > 0 && addAmount <= 100)
            if (addAmount + tonerLevel < 100) {
                this.tonerLevel += addAmount;
                return this.tonerLevel;

            } else
                return -1;
        return -1;
    }

    //Calculate the number of Printed Pages:
    public int printPageCount(int numOfPage) {
        if (this.duplex)
            this.pagePrinted += (numOfPage / 2);
        else
            this.pagePrinted += numOfPage;
        return pagePrinted;

    }

    //getter Toner Level:
    public int getTonerLevel() {
        return tonerLevel;
    }

    //getter the Number of Printed pages:
    public int getPagePrinted() {
        return pagePrinted;
    }
}
